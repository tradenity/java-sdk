package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.PaymentResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentService extends AbstractService{

    PaymentResource paymentResource;

    public PaymentService(TradenityClient client) {
        super(client);
    }

    protected PaymentResource getPaymentResource(){
        if(paymentResource == null) {
            paymentResource = resourceFactory.create(PaymentResource.class);
        }
        return paymentResource;
    }

    public Page<Payment> findAll(PageRequest pageRequest){
        Call<ResourcePage<Payment>> call =  getPaymentResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Payment> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Payment>> call =  getPaymentResource().index(fields);
        return createPage(call);
    }

    public Payment findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Payment findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Payment> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Payment> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Payment> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Payment> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Payment> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Payment> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Payment> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Payment findOne(Map<String, Object> fields){
        List<Payment> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }
}