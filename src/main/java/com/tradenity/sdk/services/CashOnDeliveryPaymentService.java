package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CashOnDeliveryPaymentResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CashOnDeliveryPaymentService extends AbstractService{

    CashOnDeliveryPaymentResource cashOnDeliveryPaymentResource;

    public CashOnDeliveryPaymentService(TradenityClient client) {
        super(client);
    }

    protected CashOnDeliveryPaymentResource getCashOnDeliveryPaymentResource(){
        if(cashOnDeliveryPaymentResource == null) {
            cashOnDeliveryPaymentResource = resourceFactory.create(CashOnDeliveryPaymentResource.class);
        }
        return cashOnDeliveryPaymentResource;
    }

    public Page<CashOnDeliveryPayment> findAll(PageRequest pageRequest){
        Call<ResourcePage<CashOnDeliveryPayment>> call =  getCashOnDeliveryPaymentResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<CashOnDeliveryPayment> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<CashOnDeliveryPayment>> call =  getCashOnDeliveryPaymentResource().index(params);
        return createPage(call);
    }

    public CashOnDeliveryPayment findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public CashOnDeliveryPayment findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<CashOnDeliveryPayment> findAll(){
        return findAll(new PageRequest());
    }

    public Page<CashOnDeliveryPayment> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<CashOnDeliveryPayment> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<CashOnDeliveryPayment> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<CashOnDeliveryPayment> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<CashOnDeliveryPayment> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<CashOnDeliveryPayment> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public CashOnDeliveryPayment findOne(Map<String, Object> fields){
        List<CashOnDeliveryPayment> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public CashOnDeliveryPayment findById(String id){
        Call<CashOnDeliveryPayment> call =  getCashOnDeliveryPaymentResource().findOne(id);
        return createInstance(call);
    }

    public CashOnDeliveryPayment create(CashOnDeliveryPayment cashOnDeliveryPayment){
        Call<CashOnDeliveryPayment> call =  getCashOnDeliveryPaymentResource().save(cashOnDeliveryPayment);
        return createInstance(call);
    }

    public CashOnDeliveryPayment update(CashOnDeliveryPayment cashOnDeliveryPayment){
        Call<CashOnDeliveryPayment> call =  getCashOnDeliveryPaymentResource().update(cashOnDeliveryPayment.getId(), cashOnDeliveryPayment);
        return createInstance(call);
    }

    public CashOnDeliveryPayment replace(CashOnDeliveryPayment cashOnDeliveryPayment){
        Call<CashOnDeliveryPayment> call =  getCashOnDeliveryPaymentResource().replace(cashOnDeliveryPayment.getId(), cashOnDeliveryPayment);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getCashOnDeliveryPaymentResource().delete(id);
        run(call);
    }

    public void delete(CashOnDeliveryPayment cashOnDeliveryPayment){
        delete(cashOnDeliveryPayment.getId());
    }
}