package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.PaymentCardResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentCardService extends AbstractService{

    PaymentCardResource paymentCardResource;

    public PaymentCardService(TradenityClient client) {
        super(client);
    }

    protected PaymentCardResource getPaymentCardResource(){
        if(paymentCardResource == null) {
            paymentCardResource = resourceFactory.create(PaymentCardResource.class);
        }
        return paymentCardResource;
    }

    public Page<PaymentCard> findAll(PageRequest pageRequest){
        Call<ResourcePage<PaymentCard>> call =  getPaymentCardResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<PaymentCard> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<PaymentCard>> call =  getPaymentCardResource().index(params);
        return createPage(call);
    }

    public PaymentCard findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public PaymentCard findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<PaymentCard> findAll(){
        return findAll(new PageRequest());
    }

    public Page<PaymentCard> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<PaymentCard> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<PaymentCard> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<PaymentCard> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<PaymentCard> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<PaymentCard> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public PaymentCard findOne(Map<String, Object> fields){
        List<PaymentCard> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public PaymentCard findById(String id){
        Call<PaymentCard> call =  getPaymentCardResource().findOne(id);
        return createInstance(call);
    }

    public PaymentCard create(PaymentCard paymentCard){
        Call<PaymentCard> call =  getPaymentCardResource().save(paymentCard);
        return createInstance(call);
    }

    public PaymentCard update(PaymentCard paymentCard){
        Call<PaymentCard> call =  getPaymentCardResource().update(paymentCard.getId(), paymentCard);
        return createInstance(call);
    }

    public PaymentCard replace(PaymentCard paymentCard){
        Call<PaymentCard> call =  getPaymentCardResource().replace(paymentCard.getId(), paymentCard);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getPaymentCardResource().delete(id);
        run(call);
    }

    public void delete(PaymentCard paymentCard){
        delete(paymentCard.getId());
    }
}