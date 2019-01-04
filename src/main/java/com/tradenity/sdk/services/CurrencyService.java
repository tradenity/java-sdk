package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CurrencyResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyService extends AbstractService{

    CurrencyResource currencyResource;

    public CurrencyService(TradenityClient client) {
        super(client);
    }

    protected CurrencyResource getCurrencyResource(){
        if(currencyResource == null) {
            currencyResource = resourceFactory.create(CurrencyResource.class);
        }
        return currencyResource;
    }

    public Page<Currency> findAll(PageRequest pageRequest){
        Call<ResourcePage<Currency>> call =  getCurrencyResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Currency> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Currency>> call =  getCurrencyResource().index(fields);
        return createPage(call);
    }

    public Currency findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Currency findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Currency> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Currency> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Currency> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Currency> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Currency> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Currency> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Currency> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Currency findOne(Map<String, Object> fields){
        List<Currency> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Currency findById(String id){
        Call<Currency> call =  getCurrencyResource().findOne(id);
        return createInstance(call);
    }

    public Currency create(Currency currency){
        Call<Currency> call =  getCurrencyResource().save(currency);
        return createInstance(call);
    }

    public Currency update(Currency currency){
        Call<Currency> call =  getCurrencyResource().update(currency.getId(), currency);
        return createInstance(call);
    }

    public Currency replace(Currency currency){
        Call<Currency> call =  getCurrencyResource().replace(currency.getId(), currency);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getCurrencyResource().delete(id);
        run(call);
    }

    public void delete(Currency currency){
        delete(currency.getId());
    }
}