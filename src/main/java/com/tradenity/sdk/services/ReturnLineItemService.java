package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.ReturnLineItemResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnLineItemService extends AbstractService{

    ReturnLineItemResource returnLineItemResource;

    public ReturnLineItemService(TradenityClient client) {
        super(client);
    }

    protected ReturnLineItemResource getReturnLineItemResource(){
        if(returnLineItemResource == null) {
            returnLineItemResource = resourceFactory.create(ReturnLineItemResource.class);
        }
        return returnLineItemResource;
    }

    public Page<ReturnLineItem> findAll(PageRequest pageRequest){
        Call<ResourcePage<ReturnLineItem>> call =  getReturnLineItemResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<ReturnLineItem> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<ReturnLineItem>> call =  getReturnLineItemResource().index(fields);
        return createPage(call);
    }

    public ReturnLineItem findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public ReturnLineItem findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<ReturnLineItem> findAll(){
        return findAll(new PageRequest());
    }

    public Page<ReturnLineItem> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<ReturnLineItem> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<ReturnLineItem> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<ReturnLineItem> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<ReturnLineItem> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<ReturnLineItem> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public ReturnLineItem findOne(Map<String, Object> fields){
        List<ReturnLineItem> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public ReturnLineItem findById(String id){
        Call<ReturnLineItem> call =  getReturnLineItemResource().findOne(id);
        return createInstance(call);
    }

    public ReturnLineItem create(ReturnLineItem returnLineItem){
        Call<ReturnLineItem> call =  getReturnLineItemResource().save(returnLineItem);
        return createInstance(call);
    }

    public ReturnLineItem update(ReturnLineItem returnLineItem){
        Call<ReturnLineItem> call =  getReturnLineItemResource().update(returnLineItem.getId(), returnLineItem);
        return createInstance(call);
    }

    public ReturnLineItem replace(ReturnLineItem returnLineItem){
        Call<ReturnLineItem> call =  getReturnLineItemResource().replace(returnLineItem.getId(), returnLineItem);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getReturnLineItemResource().delete(id);
        run(call);
    }

    public void delete(ReturnLineItem returnLineItem){
        delete(returnLineItem.getId());
    }
}