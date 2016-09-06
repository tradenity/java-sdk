package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.CurrencyResource;
import retrofit2.Call;

import java.util.HashMap;
import java.util.Map;


/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:06 PM
 */
public class CurrencyService extends AbstractService{
    CurrencyResource currencyResource;
    public CurrencyService(TradenityClient client) {
        super(client, "currencies");
    }

    protected CurrencyResource getCurrencyResource(){
        if(currencyResource == null) {
            currencyResource = resourceFactory.create(CurrencyResource.class);
        }
        return currencyResource;
    }

    public Page<Currency> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Currency> findAll(PageRequest pageRequest){
        Call<ResourcePage<Currency>> call =  getCurrencyResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Currency> search(Currency currency){
        return search(currency, new PageRequest());
    }

    public Page<Currency> search(Currency currency, PageRequest pageRequest){
        return search(notNullMap(toMap(currency)), pageRequest);
    }

    public Page<Currency> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Page<Currency> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }
        Call<ResourcePage<Currency>> call =  getCurrencyResource().index(fields);
        return createPage(call);
    }


    public Currency findById(String id){
        Call<Currency> call =  getCurrencyResource().findById(id);
        return createInstance(call);
    }

    public Currency create(Currency currency){
        Call<Currency> call =  getCurrencyResource().save(toMap(currency));
        return createInstance(call);
    }

    public Currency update(Currency currency){
        Call<Currency> call =  getCurrencyResource().update(currency.getId(), toMap(currency));
        return createInstance(call);
    }

    public boolean delete(String id){
        Call<Void> call =  getCurrencyResource().delete(id);
        return isSuccessful(call);
    }

    public boolean delete(Currency currency){
        return delete(currency.getId());
    }

    private Map<String, Object> toMap(Currency currency) {
        Map<String, Object> m = new HashMap<>();
        m.put("code", currency.getCode());
        m.put("title", currency.getTitle());
        m.put("status", currency.getStatus());
        m.put("exchangeRate", currency.getExchangeRate());
        return m;
    }

}
