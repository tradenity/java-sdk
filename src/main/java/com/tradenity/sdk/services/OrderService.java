package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.OrderResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService extends AbstractService{

    OrderResource orderResource;

    public OrderService(TradenityClient client) {
        super(client);
    }

    protected OrderResource getOrderResource(){
        if(orderResource == null) {
            orderResource = resourceFactory.create(OrderResource.class);
        }
        return orderResource;
    }

    public Page<Order> findAll(PageRequest pageRequest){
        Call<ResourcePage<Order>> call =  getOrderResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Order> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Order>> call =  getOrderResource().index(fields);
        return createPage(call);
    }

    public Order findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Order findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Order> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Order> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Order> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Order> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Order> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Order> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Order> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Order findOne(Map<String, Object> fields){
        List<Order> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Order findById(String id){
        Call<Order> call =  getOrderResource().findOne(id);
        return createInstance(call);
    }

    public Order create(Order order){
        Call<Order> call =  getOrderResource().save(order);
        return createInstance(call);
    }

    public Order update(Order order){
        Call<Order> call =  getOrderResource().update(order.getId(), order);
        return createInstance(call);
    }

    public Order replace(Order order){
        Call<Order> call =  getOrderResource().replace(order.getId(), order);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getOrderResource().delete(id);
        run(call);
    }

    public void delete(Order order){
        delete(order.getId());
    }
}