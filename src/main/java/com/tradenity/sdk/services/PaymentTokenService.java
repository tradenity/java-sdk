package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.PaymentTokenResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentTokenService extends AbstractService{

    PaymentTokenResource paymentTokenResource;

    public PaymentTokenService(TradenityClient client) {
        super(client);
    }

    protected PaymentTokenResource getPaymentTokenResource(){
        if(paymentTokenResource == null) {
            paymentTokenResource = resourceFactory.create(PaymentTokenResource.class);
        }
        return paymentTokenResource;
    }

    public Page<PaymentToken> findAll(PageRequest pageRequest){
        Call<ResourcePage<PaymentToken>> call =  getPaymentTokenResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<PaymentToken> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<PaymentToken>> call =  getPaymentTokenResource().index(params);
        return createPage(call);
    }

    public PaymentToken findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public PaymentToken findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<PaymentToken> findAll(){
        return findAll(new PageRequest());
    }

    public Page<PaymentToken> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<PaymentToken> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<PaymentToken> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<PaymentToken> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<PaymentToken> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<PaymentToken> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public PaymentToken findOne(Map<String, Object> fields){
        List<PaymentToken> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public PaymentToken findById(String id){
        Call<PaymentToken> call =  getPaymentTokenResource().findOne(id);
        return createInstance(call);
    }

    public PaymentToken create(PaymentToken paymentToken){
        Call<PaymentToken> call =  getPaymentTokenResource().save(paymentToken);
        return createInstance(call);
    }

    public PaymentToken update(PaymentToken paymentToken){
        Call<PaymentToken> call =  getPaymentTokenResource().update(paymentToken.getId(), paymentToken);
        return createInstance(call);
    }

    public PaymentToken replace(PaymentToken paymentToken){
        Call<PaymentToken> call =  getPaymentTokenResource().replace(paymentToken.getId(), paymentToken);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getPaymentTokenResource().delete(id);
        run(call);
    }

    public void delete(PaymentToken paymentToken){
        delete(paymentToken.getId());
    }
}