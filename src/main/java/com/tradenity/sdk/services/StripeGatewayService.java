package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.StripeGatewayResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StripeGatewayService extends AbstractService{

    StripeGatewayResource stripeGatewayResource;

    public StripeGatewayService(TradenityClient client) {
        super(client);
    }

    protected StripeGatewayResource getStripeGatewayResource(){
        if(stripeGatewayResource == null) {
            stripeGatewayResource = resourceFactory.create(StripeGatewayResource.class);
        }
        return stripeGatewayResource;
    }

    public Page<StripeGateway> findAll(PageRequest pageRequest){
        Call<ResourcePage<StripeGateway>> call =  getStripeGatewayResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<StripeGateway> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<StripeGateway>> call =  getStripeGatewayResource().index(params);
        return createPage(call);
    }

    public StripeGateway findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public StripeGateway findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<StripeGateway> findAll(){
        return findAll(new PageRequest());
    }

    public Page<StripeGateway> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<StripeGateway> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<StripeGateway> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<StripeGateway> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<StripeGateway> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<StripeGateway> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public StripeGateway findOne(Map<String, Object> fields){
        List<StripeGateway> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public StripeGateway findById(String id){
        Call<StripeGateway> call =  getStripeGatewayResource().findOne(id);
        return createInstance(call);
    }

    public StripeGateway create(StripeGateway stripeGateway){
        Call<StripeGateway> call =  getStripeGatewayResource().save(stripeGateway);
        return createInstance(call);
    }

    public StripeGateway update(StripeGateway stripeGateway){
        Call<StripeGateway> call =  getStripeGatewayResource().update(stripeGateway.getId(), stripeGateway);
        return createInstance(call);
    }

    public StripeGateway replace(StripeGateway stripeGateway){
        Call<StripeGateway> call =  getStripeGatewayResource().replace(stripeGateway.getId(), stripeGateway);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getStripeGatewayResource().delete(id);
        run(call);
    }

    public void delete(StripeGateway stripeGateway){
        delete(stripeGateway.getId());
    }
}