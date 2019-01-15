package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.BraintreeGatewayResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BraintreeGatewayService extends AbstractService{

    BraintreeGatewayResource braintreeGatewayResource;

    public BraintreeGatewayService(TradenityClient client) {
        super(client);
    }

    protected BraintreeGatewayResource getBraintreeGatewayResource(){
        if(braintreeGatewayResource == null) {
            braintreeGatewayResource = resourceFactory.create(BraintreeGatewayResource.class);
        }
        return braintreeGatewayResource;
    }

    public Page<BraintreeGateway> findAll(PageRequest pageRequest){
        Call<ResourcePage<BraintreeGateway>> call =  getBraintreeGatewayResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<BraintreeGateway> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<BraintreeGateway>> call =  getBraintreeGatewayResource().index(params);
        return createPage(call);
    }

    public BraintreeGateway findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public BraintreeGateway findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<BraintreeGateway> findAll(){
        return findAll(new PageRequest());
    }

    public Page<BraintreeGateway> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<BraintreeGateway> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<BraintreeGateway> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<BraintreeGateway> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<BraintreeGateway> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<BraintreeGateway> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public BraintreeGateway findOne(Map<String, Object> fields){
        List<BraintreeGateway> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public BraintreeGateway findById(String id){
        Call<BraintreeGateway> call =  getBraintreeGatewayResource().findOne(id);
        return createInstance(call);
    }

    public BraintreeGateway create(BraintreeGateway braintreeGateway){
        Call<BraintreeGateway> call =  getBraintreeGatewayResource().save(braintreeGateway);
        return createInstance(call);
    }

    public BraintreeGateway update(BraintreeGateway braintreeGateway){
        Call<BraintreeGateway> call =  getBraintreeGatewayResource().update(braintreeGateway.getId(), braintreeGateway);
        return createInstance(call);
    }

    public BraintreeGateway replace(BraintreeGateway braintreeGateway){
        Call<BraintreeGateway> call =  getBraintreeGatewayResource().replace(braintreeGateway.getId(), braintreeGateway);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getBraintreeGatewayResource().delete(id);
        run(call);
    }

    public void delete(BraintreeGateway braintreeGateway){
        delete(braintreeGateway.getId());
    }
}