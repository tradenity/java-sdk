package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.FreeShippingResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeShippingService extends AbstractService{

    FreeShippingResource freeShippingResource;

    public FreeShippingService(TradenityClient client) {
        super(client);
    }

    protected FreeShippingResource getFreeShippingResource(){
        if(freeShippingResource == null) {
            freeShippingResource = resourceFactory.create(FreeShippingResource.class);
        }
        return freeShippingResource;
    }

    public Page<FreeShipping> findAll(PageRequest pageRequest){
        Call<ResourcePage<FreeShipping>> call =  getFreeShippingResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<FreeShipping> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<FreeShipping>> call =  getFreeShippingResource().index(fields);
        return createPage(call);
    }

    public FreeShipping findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public FreeShipping findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<FreeShipping> findAll(){
        return findAll(new PageRequest());
    }

    public Page<FreeShipping> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<FreeShipping> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<FreeShipping> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<FreeShipping> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<FreeShipping> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<FreeShipping> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public FreeShipping findOne(Map<String, Object> fields){
        List<FreeShipping> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public FreeShipping findById(String id){
        Call<FreeShipping> call =  getFreeShippingResource().findOne(id);
        return createInstance(call);
    }

    public FreeShipping create(FreeShipping freeShipping){
        Call<FreeShipping> call =  getFreeShippingResource().save(freeShipping);
        return createInstance(call);
    }

    public FreeShipping update(FreeShipping freeShipping){
        Call<FreeShipping> call =  getFreeShippingResource().update(freeShipping.getId(), freeShipping);
        return createInstance(call);
    }

    public FreeShipping replace(FreeShipping freeShipping){
        Call<FreeShipping> call =  getFreeShippingResource().replace(freeShipping.getId(), freeShipping);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getFreeShippingResource().delete(id);
        run(call);
    }

    public void delete(FreeShipping freeShipping){
        delete(freeShipping.getId());
    }
}