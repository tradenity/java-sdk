package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CreditCardPaymentResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreditCardPaymentService extends AbstractService{

    CreditCardPaymentResource creditCardPaymentResource;

    public CreditCardPaymentService(TradenityClient client) {
        super(client);
    }

    protected CreditCardPaymentResource getCreditCardPaymentResource(){
        if(creditCardPaymentResource == null) {
            creditCardPaymentResource = resourceFactory.create(CreditCardPaymentResource.class);
        }
        return creditCardPaymentResource;
    }

    public Page<CreditCardPayment> findAll(PageRequest pageRequest){
        Call<ResourcePage<CreditCardPayment>> call =  getCreditCardPaymentResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<CreditCardPayment> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<CreditCardPayment>> call =  getCreditCardPaymentResource().index(fields);
        return createPage(call);
    }

    public CreditCardPayment findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public CreditCardPayment findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<CreditCardPayment> findAll(){
        return findAll(new PageRequest());
    }

    public Page<CreditCardPayment> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<CreditCardPayment> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<CreditCardPayment> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<CreditCardPayment> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<CreditCardPayment> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<CreditCardPayment> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public CreditCardPayment findOne(Map<String, Object> fields){
        List<CreditCardPayment> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public CreditCardPayment findById(String id){
        Call<CreditCardPayment> call =  getCreditCardPaymentResource().findOne(id);
        return createInstance(call);
    }

    public CreditCardPayment create(CreditCardPayment creditCardPayment){
        Call<CreditCardPayment> call =  getCreditCardPaymentResource().save(creditCardPayment);
        return createInstance(call);
    }

    public CreditCardPayment update(CreditCardPayment creditCardPayment){
        Call<CreditCardPayment> call =  getCreditCardPaymentResource().update(creditCardPayment.getId(), creditCardPayment);
        return createInstance(call);
    }

    public CreditCardPayment replace(CreditCardPayment creditCardPayment){
        Call<CreditCardPayment> call =  getCreditCardPaymentResource().replace(creditCardPayment.getId(), creditCardPayment);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getCreditCardPaymentResource().delete(id);
        run(call);
    }

    public void delete(CreditCardPayment creditCardPayment){
        delete(creditCardPayment.getId());
    }
}