package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.BrandResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrandService extends AbstractService{

    BrandResource brandResource;

    public BrandService(TradenityClient client) {
        super(client);
    }

    protected BrandResource getBrandResource(){
        if(brandResource == null) {
            brandResource = resourceFactory.create(BrandResource.class);
        }
        return brandResource;
    }

    public Page<Brand> findAll(PageRequest pageRequest){
        Call<ResourcePage<Brand>> call =  getBrandResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Brand> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Brand>> call =  getBrandResource().index(fields);
        return createPage(call);
    }

    public Brand findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Brand findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Brand> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Brand> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Brand> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Brand> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Brand> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Brand> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Brand> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Brand findOne(Map<String, Object> fields){
        List<Brand> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Brand findById(String id){
        Call<Brand> call =  getBrandResource().findOne(id);
        return createInstance(call);
    }

    public Brand create(Brand brand){
        Call<Brand> call =  getBrandResource().save(brand);
        return createInstance(call);
    }

    public Brand update(Brand brand){
        Call<Brand> call =  getBrandResource().update(brand.getId(), brand);
        return createInstance(call);
    }

    public Brand replace(Brand brand){
        Call<Brand> call =  getBrandResource().replace(brand.getId(), brand);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getBrandResource().delete(id);
        run(call);
    }

    public void delete(Brand brand){
        delete(brand.getId());
    }
}