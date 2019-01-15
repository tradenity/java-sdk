package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.PaymentSourceResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentSourceService extends AbstractService{

    PaymentSourceResource paymentSourceResource;

    public PaymentSourceService(TradenityClient client) {
        super(client);
    }

    protected PaymentSourceResource getPaymentSourceResource(){
        if(paymentSourceResource == null) {
            paymentSourceResource = resourceFactory.create(PaymentSourceResource.class);
        }
        return paymentSourceResource;
    }

    public Page<PaymentSource> findAll(PageRequest pageRequest){
        Call<ResourcePage<PaymentSource>> call =  getPaymentSourceResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<PaymentSource> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<PaymentSource>> call =  getPaymentSourceResource().index(params);
        return createPage(call);
    }

    public PaymentSource findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public PaymentSource findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<PaymentSource> findAll(){
        return findAll(new PageRequest());
    }

    public Page<PaymentSource> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<PaymentSource> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<PaymentSource> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<PaymentSource> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<PaymentSource> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<PaymentSource> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public PaymentSource findOne(Map<String, Object> fields){
        List<PaymentSource> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }
}