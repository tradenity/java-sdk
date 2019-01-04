package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.OrderLineItemResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderLineItemService extends AbstractService{

    OrderLineItemResource orderLineItemResource;

    public OrderLineItemService(TradenityClient client) {
        super(client);
    }

    protected OrderLineItemResource getOrderLineItemResource(){
        if(orderLineItemResource == null) {
            orderLineItemResource = resourceFactory.create(OrderLineItemResource.class);
        }
        return orderLineItemResource;
    }

    public Page<OrderLineItem> findAll(PageRequest pageRequest){
        Call<ResourcePage<OrderLineItem>> call =  getOrderLineItemResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<OrderLineItem> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<OrderLineItem>> call =  getOrderLineItemResource().index(fields);
        return createPage(call);
    }

    public OrderLineItem findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public OrderLineItem findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<OrderLineItem> findAll(){
        return findAll(new PageRequest());
    }

    public Page<OrderLineItem> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<OrderLineItem> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<OrderLineItem> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<OrderLineItem> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<OrderLineItem> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<OrderLineItem> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public OrderLineItem findOne(Map<String, Object> fields){
        List<OrderLineItem> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public OrderLineItem findById(String id){
        Call<OrderLineItem> call =  getOrderLineItemResource().findOne(id);
        return createInstance(call);
    }

    public OrderLineItem create(OrderLineItem orderLineItem){
        Call<OrderLineItem> call =  getOrderLineItemResource().save(orderLineItem);
        return createInstance(call);
    }

    public OrderLineItem update(OrderLineItem orderLineItem){
        Call<OrderLineItem> call =  getOrderLineItemResource().update(orderLineItem.getId(), orderLineItem);
        return createInstance(call);
    }

    public OrderLineItem replace(OrderLineItem orderLineItem){
        Call<OrderLineItem> call =  getOrderLineItemResource().replace(orderLineItem.getId(), orderLineItem);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getOrderLineItemResource().delete(id);
        run(call);
    }

    public void delete(OrderLineItem orderLineItem){
        delete(orderLineItem.getId());
    }
}