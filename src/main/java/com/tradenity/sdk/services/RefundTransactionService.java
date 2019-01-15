package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.RefundTransactionResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RefundTransactionService extends AbstractService{

    RefundTransactionResource refundTransactionResource;

    public RefundTransactionService(TradenityClient client) {
        super(client);
    }

    protected RefundTransactionResource getRefundTransactionResource(){
        if(refundTransactionResource == null) {
            refundTransactionResource = resourceFactory.create(RefundTransactionResource.class);
        }
        return refundTransactionResource;
    }

    public Page<RefundTransaction> findAll(PageRequest pageRequest){
        Call<ResourcePage<RefundTransaction>> call =  getRefundTransactionResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<RefundTransaction> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<RefundTransaction>> call =  getRefundTransactionResource().index(params);
        return createPage(call);
    }

    public RefundTransaction findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public RefundTransaction findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<RefundTransaction> findAll(){
        return findAll(new PageRequest());
    }

    public Page<RefundTransaction> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<RefundTransaction> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<RefundTransaction> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<RefundTransaction> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<RefundTransaction> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<RefundTransaction> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public RefundTransaction findOne(Map<String, Object> fields){
        List<RefundTransaction> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public RefundTransaction findById(String id){
        Call<RefundTransaction> call =  getRefundTransactionResource().findOne(id);
        return createInstance(call);
    }

    public RefundTransaction create(RefundTransaction refundTransaction){
        Call<RefundTransaction> call =  getRefundTransactionResource().save(refundTransaction);
        return createInstance(call);
    }

    public RefundTransaction update(RefundTransaction refundTransaction){
        Call<RefundTransaction> call =  getRefundTransactionResource().update(refundTransaction.getId(), refundTransaction);
        return createInstance(call);
    }

    public RefundTransaction replace(RefundTransaction refundTransaction){
        Call<RefundTransaction> call =  getRefundTransactionResource().replace(refundTransaction.getId(), refundTransaction);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getRefundTransactionResource().delete(id);
        run(call);
    }

    public void delete(RefundTransaction refundTransaction){
        delete(refundTransaction.getId());
    }
}