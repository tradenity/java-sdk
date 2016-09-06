package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.OrderResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:06 PM
 */
public class OrderService extends AbstractService{
    OrderResource orderResource;
    public OrderService(TradenityClient client) {
        super(client, "orders");
    }

    protected OrderResource getOrderResource(){
        if(orderResource == null) {
            orderResource = resourceFactory.create(OrderResource.class);
        }
        return orderResource;
    }

    public Page<Order> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Order> findAll(PageRequest pageRequest){
        Call<ResourcePage<Order>> call =  getOrderResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Order> search(Order order){
        return search(order, new PageRequest());
    }

    public Page<Order> search(Order order, PageRequest pageRequest){
        Map<String, Object> fields = primitiveMap(order);
        return search(fields, pageRequest);
    }

    public Page<Order> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }
        Call<ResourcePage<Order>> call =  getOrderResource().index(params);
        return createPage(call);
    }

    public Page<Order> findAllByCustomer(Customer customer, PageRequest pageRequest) {
        return search(Collections.<String, Object>singletonMap("customer", customer.getId()), pageRequest);
    }

    public Order findById(String id){
        Call<Order> call =  getOrderResource().findOne(id);
        return createInstance(call);
    }

    public Transaction placeOrder(Order order, String stripeToken) {
        Map<String, Object> fields = placeOrderMap(order);
        fields.put("paymentSource", stripeToken);
        Call<Transaction> call =  getOrderResource().create(fields);
        return createInstance(call);
    }

    public Transaction refund(Order order) {
        return refund(order.getId());
    }

    public Transaction refund(String orderId) {
        Call<Transaction> call =  getOrderResource().refund(orderId);
        return createInstance(call);
    }

    public boolean delete(String id){
        Call<Void> call =  getOrderResource().delete(id);
        return isSuccessful(call);
    }

    public boolean delete(Order order){
        return delete(order.getId());
    }

    private Map<String, Object> placeOrderMap(Order order) {
        Map<String, Object> m = new HashMap<>();
        if(order.getCustomer() != null && order.getCustomer().getId() != null) {
            m.put("customer", order.getCustomer().getId());
        }else{
            throw new IllegalStateException("Order must have a customer with customer Id.");
        }
        if(order.getCurrency() != null && order.getCurrency().getId() != null){
            m.put("currency", order.getCurrency().getId());
        }
        if(order.getGateway() != null && order.getGateway().getId() != null){
            m.put("gateway", order.getGateway().getId());
        }
        if(order.getShippingMethod() != null && order.getShippingMethod().getId() != null){
            m.put("shippingMethod", order.getShippingMethod().getId());
        }
        if(order.getBillingAddress() != null){
            m.putAll(withPrefix("billingAddress.", addressAsMap(order.getBillingAddress())));
        }
        if(order.getShippingAddress() != null){
            m.putAll(withPrefix("shippingAddress.", addressAsMap(order.getShippingAddress())));
        }
        return m;
    }
    private Map<String, Object> primitiveMap(Order order) {
        Map<String, Object> m = new HashMap<>();
        m.put("status", order.getStatus());
        m.put("total", order.getTotal());
        m.put("subtotal", order.getSubtotal());
        m.put("shippingCost", order.getShippingCost());
        return m;
    }

    private Map<String, Object> addressAsMap(Address address) {
        Map<String, Object> m = new HashMap<>();
        m.put("streetLine1", address.getStreetLine1());
        m.put("streetLine2", address.getStreetLine2());
        m.put("city", address.getCity());
        m.put("state", address.getState());
        m.put("zipCode", address.getZipCode());
        m.put("country", address.getCountry());
        return m;
    }
}
