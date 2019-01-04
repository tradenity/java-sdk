package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CancelOperationResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CancelOperationService extends AbstractService{

    CancelOperationResource cancelOperationResource;

    public CancelOperationService(TradenityClient client) {
        super(client);
    }

    protected CancelOperationResource getCancelOperationResource(){
        if(cancelOperationResource == null) {
            cancelOperationResource = resourceFactory.create(CancelOperationResource.class);
        }
        return cancelOperationResource;
    }

    public Page<CancelOperation> findAll(PageRequest pageRequest){
        Call<ResourcePage<CancelOperation>> call =  getCancelOperationResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<CancelOperation> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<CancelOperation>> call =  getCancelOperationResource().index(fields);
        return createPage(call);
    }

    public CancelOperation findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public CancelOperation findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<CancelOperation> findAll(){
        return findAll(new PageRequest());
    }

    public Page<CancelOperation> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<CancelOperation> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<CancelOperation> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<CancelOperation> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<CancelOperation> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<CancelOperation> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public CancelOperation findOne(Map<String, Object> fields){
        List<CancelOperation> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public CancelOperation findById(String id){
        Call<CancelOperation> call =  getCancelOperationResource().findOne(id);
        return createInstance(call);
    }

    public CancelOperation create(CancelOperation cancelOperation){
        Call<CancelOperation> call =  getCancelOperationResource().save(cancelOperation);
        return createInstance(call);
    }

    public CancelOperation update(CancelOperation cancelOperation){
        Call<CancelOperation> call =  getCancelOperationResource().update(cancelOperation.getId(), cancelOperation);
        return createInstance(call);
    }

    public CancelOperation replace(CancelOperation cancelOperation){
        Call<CancelOperation> call =  getCancelOperationResource().replace(cancelOperation.getId(), cancelOperation);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getCancelOperationResource().delete(id);
        run(call);
    }

    public void delete(CancelOperation cancelOperation){
        delete(cancelOperation.getId());
    }
}