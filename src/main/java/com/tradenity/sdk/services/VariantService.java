package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.VariantResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariantService extends AbstractService{

    VariantResource variantResource;

    public VariantService(TradenityClient client) {
        super(client);
    }

    protected VariantResource getVariantResource(){
        if(variantResource == null) {
            variantResource = resourceFactory.create(VariantResource.class);
        }
        return variantResource;
    }

    public Page<Variant> findAll(PageRequest pageRequest){
        Call<ResourcePage<Variant>> call =  getVariantResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Variant> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Variant>> call =  getVariantResource().index(params);
        return createPage(call);
    }

    public Variant findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Variant findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Variant> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Variant> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Variant> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Variant> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Variant> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Variant> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Variant> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Variant findOne(Map<String, Object> fields){
        List<Variant> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Variant findById(String id){
        Call<Variant> call =  getVariantResource().findOne(id);
        return createInstance(call);
    }

    public Variant create(Variant variant){
        Call<Variant> call =  getVariantResource().save(variant);
        return createInstance(call);
    }

    public Variant update(Variant variant){
        Call<Variant> call =  getVariantResource().update(variant.getId(), variant);
        return createInstance(call);
    }

    public Variant replace(Variant variant){
        Call<Variant> call =  getVariantResource().replace(variant.getId(), variant);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getVariantResource().delete(id);
        run(call);
    }

    public void delete(Variant variant){
        delete(variant.getId());
    }
}