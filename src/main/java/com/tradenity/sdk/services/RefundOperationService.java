package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.RefundOperationResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RefundOperationService extends AbstractService{

    RefundOperationResource refundOperationResource;

    public RefundOperationService(TradenityClient client) {
        super(client);
    }

    protected RefundOperationResource getRefundOperationResource(){
        if(refundOperationResource == null) {
            refundOperationResource = resourceFactory.create(RefundOperationResource.class);
        }
        return refundOperationResource;
    }

    public Page<RefundOperation> findAll(PageRequest pageRequest){
        Call<ResourcePage<RefundOperation>> call =  getRefundOperationResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<RefundOperation> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<RefundOperation>> call =  getRefundOperationResource().index(params);
        return createPage(call);
    }

    public RefundOperation findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public RefundOperation findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<RefundOperation> findAll(){
        return findAll(new PageRequest());
    }

    public Page<RefundOperation> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<RefundOperation> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<RefundOperation> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<RefundOperation> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<RefundOperation> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<RefundOperation> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public RefundOperation findOne(Map<String, Object> fields){
        List<RefundOperation> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }
}