package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.StoreCreditResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreCreditService extends AbstractService{

    StoreCreditResource storeCreditResource;

    public StoreCreditService(TradenityClient client) {
        super(client);
    }

    protected StoreCreditResource getStoreCreditResource(){
        if(storeCreditResource == null) {
            storeCreditResource = resourceFactory.create(StoreCreditResource.class);
        }
        return storeCreditResource;
    }

    public Page<StoreCredit> findAll(PageRequest pageRequest){
        Call<ResourcePage<StoreCredit>> call =  getStoreCreditResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<StoreCredit> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<StoreCredit>> call =  getStoreCreditResource().index(params);
        return createPage(call);
    }

    public StoreCredit findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public StoreCredit findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<StoreCredit> findAll(){
        return findAll(new PageRequest());
    }

    public Page<StoreCredit> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<StoreCredit> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<StoreCredit> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<StoreCredit> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<StoreCredit> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<StoreCredit> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public StoreCredit findOne(Map<String, Object> fields){
        List<StoreCredit> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public StoreCredit findById(String id){
        Call<StoreCredit> call =  getStoreCreditResource().findOne(id);
        return createInstance(call);
    }

    public StoreCredit create(StoreCredit storeCredit){
        Call<StoreCredit> call =  getStoreCreditResource().save(storeCredit);
        return createInstance(call);
    }

    public StoreCredit update(StoreCredit storeCredit){
        Call<StoreCredit> call =  getStoreCreditResource().update(storeCredit.getId(), storeCredit);
        return createInstance(call);
    }

    public StoreCredit replace(StoreCredit storeCredit){
        Call<StoreCredit> call =  getStoreCreditResource().replace(storeCredit.getId(), storeCredit);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getStoreCreditResource().delete(id);
        run(call);
    }

    public void delete(StoreCredit storeCredit){
        delete(storeCredit.getId());
    }
}