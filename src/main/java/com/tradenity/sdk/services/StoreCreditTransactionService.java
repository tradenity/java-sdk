package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.StoreCreditTransactionResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreCreditTransactionService extends AbstractService{

    StoreCreditTransactionResource storeCreditTransactionResource;

    public StoreCreditTransactionService(TradenityClient client) {
        super(client);
    }

    protected StoreCreditTransactionResource getStoreCreditTransactionResource(){
        if(storeCreditTransactionResource == null) {
            storeCreditTransactionResource = resourceFactory.create(StoreCreditTransactionResource.class);
        }
        return storeCreditTransactionResource;
    }

    public Page<StoreCreditTransaction> findAll(PageRequest pageRequest){
        Call<ResourcePage<StoreCreditTransaction>> call =  getStoreCreditTransactionResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<StoreCreditTransaction> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<StoreCreditTransaction>> call =  getStoreCreditTransactionResource().index(fields);
        return createPage(call);
    }

    public StoreCreditTransaction findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public StoreCreditTransaction findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<StoreCreditTransaction> findAll(){
        return findAll(new PageRequest());
    }

    public Page<StoreCreditTransaction> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<StoreCreditTransaction> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<StoreCreditTransaction> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<StoreCreditTransaction> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<StoreCreditTransaction> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<StoreCreditTransaction> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public StoreCreditTransaction findOne(Map<String, Object> fields){
        List<StoreCreditTransaction> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public StoreCreditTransaction findById(String id){
        Call<StoreCreditTransaction> call =  getStoreCreditTransactionResource().findOne(id);
        return createInstance(call);
    }

    public StoreCreditTransaction create(StoreCreditTransaction storeCreditTransaction){
        Call<StoreCreditTransaction> call =  getStoreCreditTransactionResource().save(storeCreditTransaction);
        return createInstance(call);
    }

    public StoreCreditTransaction update(StoreCreditTransaction storeCreditTransaction){
        Call<StoreCreditTransaction> call =  getStoreCreditTransactionResource().update(storeCreditTransaction.getId(), storeCreditTransaction);
        return createInstance(call);
    }

    public StoreCreditTransaction replace(StoreCreditTransaction storeCreditTransaction){
        Call<StoreCreditTransaction> call =  getStoreCreditTransactionResource().replace(storeCreditTransaction.getId(), storeCreditTransaction);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getStoreCreditTransactionResource().delete(id);
        run(call);
    }

    public void delete(StoreCreditTransaction storeCreditTransaction){
        delete(storeCreditTransaction.getId());
    }
}