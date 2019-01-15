package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.PaymentTransactionResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentTransactionService extends AbstractService{

    PaymentTransactionResource paymentTransactionResource;

    public PaymentTransactionService(TradenityClient client) {
        super(client);
    }

    protected PaymentTransactionResource getPaymentTransactionResource(){
        if(paymentTransactionResource == null) {
            paymentTransactionResource = resourceFactory.create(PaymentTransactionResource.class);
        }
        return paymentTransactionResource;
    }

    public Page<PaymentTransaction> findAll(PageRequest pageRequest){
        Call<ResourcePage<PaymentTransaction>> call =  getPaymentTransactionResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<PaymentTransaction> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<PaymentTransaction>> call =  getPaymentTransactionResource().index(params);
        return createPage(call);
    }

    public PaymentTransaction findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public PaymentTransaction findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<PaymentTransaction> findAll(){
        return findAll(new PageRequest());
    }

    public Page<PaymentTransaction> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<PaymentTransaction> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<PaymentTransaction> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<PaymentTransaction> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<PaymentTransaction> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<PaymentTransaction> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public PaymentTransaction findOne(Map<String, Object> fields){
        List<PaymentTransaction> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public PaymentTransaction findById(String id){
        Call<PaymentTransaction> call =  getPaymentTransactionResource().findOne(id);
        return createInstance(call);
    }

    public PaymentTransaction create(PaymentTransaction paymentTransaction){
        Call<PaymentTransaction> call =  getPaymentTransactionResource().save(paymentTransaction);
        return createInstance(call);
    }

    public PaymentTransaction update(PaymentTransaction paymentTransaction){
        Call<PaymentTransaction> call =  getPaymentTransactionResource().update(paymentTransaction.getId(), paymentTransaction);
        return createInstance(call);
    }

    public PaymentTransaction replace(PaymentTransaction paymentTransaction){
        Call<PaymentTransaction> call =  getPaymentTransactionResource().replace(paymentTransaction.getId(), paymentTransaction);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getPaymentTransactionResource().delete(id);
        run(call);
    }

    public void delete(PaymentTransaction paymentTransaction){
        delete(paymentTransaction.getId());
    }
}