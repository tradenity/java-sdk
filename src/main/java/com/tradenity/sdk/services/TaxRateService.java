package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.TaxRateResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxRateService extends AbstractService{

    TaxRateResource taxRateResource;

    public TaxRateService(TradenityClient client) {
        super(client);
    }

    protected TaxRateResource getTaxRateResource(){
        if(taxRateResource == null) {
            taxRateResource = resourceFactory.create(TaxRateResource.class);
        }
        return taxRateResource;
    }

    public Page<TaxRate> findAll(PageRequest pageRequest){
        Call<ResourcePage<TaxRate>> call =  getTaxRateResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<TaxRate> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<TaxRate>> call =  getTaxRateResource().index(fields);
        return createPage(call);
    }

    public TaxRate findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public TaxRate findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<TaxRate> findAll(){
        return findAll(new PageRequest());
    }

    public Page<TaxRate> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<TaxRate> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<TaxRate> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<TaxRate> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<TaxRate> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<TaxRate> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public TaxRate findOne(Map<String, Object> fields){
        List<TaxRate> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public TaxRate findById(String id){
        Call<TaxRate> call =  getTaxRateResource().findOne(id);
        return createInstance(call);
    }

    public TaxRate create(TaxRate taxRate){
        Call<TaxRate> call =  getTaxRateResource().save(taxRate);
        return createInstance(call);
    }

    public TaxRate update(TaxRate taxRate){
        Call<TaxRate> call =  getTaxRateResource().update(taxRate.getId(), taxRate);
        return createInstance(call);
    }

    public TaxRate replace(TaxRate taxRate){
        Call<TaxRate> call =  getTaxRateResource().replace(taxRate.getId(), taxRate);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getTaxRateResource().delete(id);
        run(call);
    }

    public void delete(TaxRate taxRate){
        delete(taxRate.getId());
    }
}