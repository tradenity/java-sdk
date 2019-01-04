package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.TransactionResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionService extends AbstractService{

    TransactionResource transactionResource;

    public TransactionService(TradenityClient client) {
        super(client);
    }

    protected TransactionResource getTransactionResource(){
        if(transactionResource == null) {
            transactionResource = resourceFactory.create(TransactionResource.class);
        }
        return transactionResource;
    }

    public Page<Transaction> findAll(PageRequest pageRequest){
        Call<ResourcePage<Transaction>> call =  getTransactionResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Transaction> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Transaction>> call =  getTransactionResource().index(fields);
        return createPage(call);
    }

    public Transaction findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Transaction findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Transaction> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Transaction> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Transaction> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Transaction> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Transaction> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Transaction> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Transaction> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Transaction findOne(Map<String, Object> fields){
        List<Transaction> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Transaction findById(String id){
        Call<Transaction> call =  getTransactionResource().findOne(id);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getTransactionResource().delete(id);
        run(call);
    }

    public void delete(Transaction transaction){
        delete(transaction.getId());
    }
}