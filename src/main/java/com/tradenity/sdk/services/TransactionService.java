package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.TransactionResource;
import retrofit2.Call;

import java.util.HashMap;
import java.util.Map;


/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:06 PM
 */
public class TransactionService extends AbstractService{

    TransactionResource transactionResource;

    public TransactionService(TradenityClient client) {
        super(client, "transactions");
    }

    protected TransactionResource getTransactionResource(){
        if(transactionResource == null) {
            transactionResource = resourceFactory.create(TransactionResource.class);
        }
        return transactionResource;
    }

    public Page<Transaction> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Transaction> findAll(PageRequest pageRequest){
        Call<ResourcePage<Transaction>> call =  getTransactionResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Transaction> search(Transaction transaction){
        return search(transaction, new PageRequest());
    }

    public Page<Transaction> search(Transaction transaction, PageRequest pageRequest){
        return search(notNullMap(toMap(transaction)), pageRequest);
    }

    public Page<Transaction> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Page<Transaction> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }
        Call<ResourcePage<Transaction>> call =  getTransactionResource().index(fields);
        return createPage(call);
    }

    public Transaction findById(String id){
        Call<Transaction> call =  getTransactionResource().findById(id);
        return createInstance(call);
    }

    public Transaction create(Transaction transaction){
        Call<Transaction> call =  getTransactionResource().save(toMap(transaction));
        return createInstance(call);
    }

    public Transaction update(Transaction transaction){
        Call<Transaction> call =  getTransactionResource().update(transaction.getId(), notNullMap(toMap(transaction)));
        return createInstance(call);
    }

    public boolean delete(String id){
        Call<Void> call =  getTransactionResource().delete(id);
        return isSuccessful(call);
    }

    public boolean delete(Transaction transaction){
        return delete(transaction.getId());
    }

    public Map<String, Object> toMap(Transaction tx) {
        Map<String, Object> m = new HashMap<>();
        m.put("gatewayOperationId", tx.getGatewayOperationId());
        m.put("type", tx.getType());
        m.put("status", tx.getStatus());
        return m;
    }


}
