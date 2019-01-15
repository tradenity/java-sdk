package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.ReturnOperationResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnOperationService extends AbstractService{

    ReturnOperationResource returnOperationResource;

    public ReturnOperationService(TradenityClient client) {
        super(client);
    }

    protected ReturnOperationResource getReturnOperationResource(){
        if(returnOperationResource == null) {
            returnOperationResource = resourceFactory.create(ReturnOperationResource.class);
        }
        return returnOperationResource;
    }

    public Page<ReturnOperation> findAll(PageRequest pageRequest){
        Call<ResourcePage<ReturnOperation>> call =  getReturnOperationResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<ReturnOperation> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<ReturnOperation>> call =  getReturnOperationResource().index(params);
        return createPage(call);
    }

    public ReturnOperation findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public ReturnOperation findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<ReturnOperation> findAll(){
        return findAll(new PageRequest());
    }

    public Page<ReturnOperation> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<ReturnOperation> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<ReturnOperation> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<ReturnOperation> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<ReturnOperation> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<ReturnOperation> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public ReturnOperation findOne(Map<String, Object> fields){
        List<ReturnOperation> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public ReturnOperation findById(String id){
        Call<ReturnOperation> call =  getReturnOperationResource().findOne(id);
        return createInstance(call);
    }

    public ReturnOperation create(ReturnOperation returnOperation){
        Call<ReturnOperation> call =  getReturnOperationResource().save(returnOperation);
        return createInstance(call);
    }

    public ReturnOperation update(ReturnOperation returnOperation){
        Call<ReturnOperation> call =  getReturnOperationResource().update(returnOperation.getId(), returnOperation);
        return createInstance(call);
    }

    public ReturnOperation replace(ReturnOperation returnOperation){
        Call<ReturnOperation> call =  getReturnOperationResource().replace(returnOperation.getId(), returnOperation);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getReturnOperationResource().delete(id);
        run(call);
    }

    public void delete(ReturnOperation returnOperation){
        delete(returnOperation.getId());
    }
}