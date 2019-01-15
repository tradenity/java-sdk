package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.TaxClassResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxClassService extends AbstractService{

    TaxClassResource taxClassResource;

    public TaxClassService(TradenityClient client) {
        super(client);
    }

    protected TaxClassResource getTaxClassResource(){
        if(taxClassResource == null) {
            taxClassResource = resourceFactory.create(TaxClassResource.class);
        }
        return taxClassResource;
    }

    public Page<TaxClass> findAll(PageRequest pageRequest){
        Call<ResourcePage<TaxClass>> call =  getTaxClassResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<TaxClass> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<TaxClass>> call =  getTaxClassResource().index(params);
        return createPage(call);
    }

    public TaxClass findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public TaxClass findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<TaxClass> findAll(){
        return findAll(new PageRequest());
    }

    public Page<TaxClass> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<TaxClass> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<TaxClass> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<TaxClass> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<TaxClass> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<TaxClass> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public TaxClass findOne(Map<String, Object> fields){
        List<TaxClass> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public TaxClass findById(String id){
        Call<TaxClass> call =  getTaxClassResource().findOne(id);
        return createInstance(call);
    }

    public TaxClass create(TaxClass taxClass){
        Call<TaxClass> call =  getTaxClassResource().save(taxClass);
        return createInstance(call);
    }

    public TaxClass update(TaxClass taxClass){
        Call<TaxClass> call =  getTaxClassResource().update(taxClass.getId(), taxClass);
        return createInstance(call);
    }

    public TaxClass replace(TaxClass taxClass){
        Call<TaxClass> call =  getTaxClassResource().replace(taxClass.getId(), taxClass);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getTaxClassResource().delete(id);
        run(call);
    }

    public void delete(TaxClass taxClass){
        delete(taxClass.getId());
    }
}