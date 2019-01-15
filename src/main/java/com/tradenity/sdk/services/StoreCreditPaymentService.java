package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.StoreCreditPaymentResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreCreditPaymentService extends AbstractService{

    StoreCreditPaymentResource storeCreditPaymentResource;

    public StoreCreditPaymentService(TradenityClient client) {
        super(client);
    }

    protected StoreCreditPaymentResource getStoreCreditPaymentResource(){
        if(storeCreditPaymentResource == null) {
            storeCreditPaymentResource = resourceFactory.create(StoreCreditPaymentResource.class);
        }
        return storeCreditPaymentResource;
    }

    public Page<StoreCreditPayment> findAll(PageRequest pageRequest){
        Call<ResourcePage<StoreCreditPayment>> call =  getStoreCreditPaymentResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<StoreCreditPayment> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<StoreCreditPayment>> call =  getStoreCreditPaymentResource().index(params);
        return createPage(call);
    }

    public StoreCreditPayment findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public StoreCreditPayment findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<StoreCreditPayment> findAll(){
        return findAll(new PageRequest());
    }

    public Page<StoreCreditPayment> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<StoreCreditPayment> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<StoreCreditPayment> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<StoreCreditPayment> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<StoreCreditPayment> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<StoreCreditPayment> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public StoreCreditPayment findOne(Map<String, Object> fields){
        List<StoreCreditPayment> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public StoreCreditPayment findById(String id){
        Call<StoreCreditPayment> call =  getStoreCreditPaymentResource().findOne(id);
        return createInstance(call);
    }

    public StoreCreditPayment create(StoreCreditPayment storeCreditPayment){
        Call<StoreCreditPayment> call =  getStoreCreditPaymentResource().save(storeCreditPayment);
        return createInstance(call);
    }

    public StoreCreditPayment update(StoreCreditPayment storeCreditPayment){
        Call<StoreCreditPayment> call =  getStoreCreditPaymentResource().update(storeCreditPayment.getId(), storeCreditPayment);
        return createInstance(call);
    }

    public StoreCreditPayment replace(StoreCreditPayment storeCreditPayment){
        Call<StoreCreditPayment> call =  getStoreCreditPaymentResource().replace(storeCreditPayment.getId(), storeCreditPayment);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getStoreCreditPaymentResource().delete(id);
        run(call);
    }

    public void delete(StoreCreditPayment storeCreditPayment){
        delete(storeCreditPayment.getId());
    }
}