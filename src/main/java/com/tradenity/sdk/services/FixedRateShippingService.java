package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.FixedRateShippingResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FixedRateShippingService extends AbstractService{

    FixedRateShippingResource fixedRateShippingResource;

    public FixedRateShippingService(TradenityClient client) {
        super(client);
    }

    protected FixedRateShippingResource getFixedRateShippingResource(){
        if(fixedRateShippingResource == null) {
            fixedRateShippingResource = resourceFactory.create(FixedRateShippingResource.class);
        }
        return fixedRateShippingResource;
    }

    public Page<FixedRateShipping> findAll(PageRequest pageRequest){
        Call<ResourcePage<FixedRateShipping>> call =  getFixedRateShippingResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<FixedRateShipping> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<FixedRateShipping>> call =  getFixedRateShippingResource().index(fields);
        return createPage(call);
    }

    public FixedRateShipping findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public FixedRateShipping findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<FixedRateShipping> findAll(){
        return findAll(new PageRequest());
    }

    public Page<FixedRateShipping> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<FixedRateShipping> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<FixedRateShipping> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<FixedRateShipping> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<FixedRateShipping> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<FixedRateShipping> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public FixedRateShipping findOne(Map<String, Object> fields){
        List<FixedRateShipping> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public FixedRateShipping findById(String id){
        Call<FixedRateShipping> call =  getFixedRateShippingResource().findOne(id);
        return createInstance(call);
    }

    public FixedRateShipping create(FixedRateShipping fixedRateShipping){
        Call<FixedRateShipping> call =  getFixedRateShippingResource().save(fixedRateShipping);
        return createInstance(call);
    }

    public FixedRateShipping update(FixedRateShipping fixedRateShipping){
        Call<FixedRateShipping> call =  getFixedRateShippingResource().update(fixedRateShipping.getId(), fixedRateShipping);
        return createInstance(call);
    }

    public FixedRateShipping replace(FixedRateShipping fixedRateShipping){
        Call<FixedRateShipping> call =  getFixedRateShippingResource().replace(fixedRateShipping.getId(), fixedRateShipping);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getFixedRateShippingResource().delete(id);
        run(call);
    }

    public void delete(FixedRateShipping fixedRateShipping){
        delete(fixedRateShipping.getId());
    }
}