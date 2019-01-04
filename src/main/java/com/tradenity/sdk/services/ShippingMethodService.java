package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.ShippingMethodResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShippingMethodService extends AbstractService{

    ShippingMethodResource shippingMethodResource;

    public ShippingMethodService(TradenityClient client) {
        super(client);
    }

    protected ShippingMethodResource getShippingMethodResource(){
        if(shippingMethodResource == null) {
            shippingMethodResource = resourceFactory.create(ShippingMethodResource.class);
        }
        return shippingMethodResource;
    }

    public Page<ShippingMethod> findAll(PageRequest pageRequest){
        Call<ResourcePage<ShippingMethod>> call =  getShippingMethodResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<ShippingMethod> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<ShippingMethod>> call =  getShippingMethodResource().index(fields);
        return createPage(call);
    }

    public ShippingMethod findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public ShippingMethod findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<ShippingMethod> findAll(){
        return findAll(new PageRequest());
    }

    public Page<ShippingMethod> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<ShippingMethod> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<ShippingMethod> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<ShippingMethod> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<ShippingMethod> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<ShippingMethod> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public ShippingMethod findOne(Map<String, Object> fields){
        List<ShippingMethod> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public List<ShippingMethod> findAllForOrder(String orderId){
        Call<List<ShippingMethod>> call =  getShippingMethodResource().findAllForOrder(orderId);
        return createList(call);
    }
}