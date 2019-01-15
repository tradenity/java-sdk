package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CategoryResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryService extends AbstractService{

    CategoryResource categoryResource;

    public CategoryService(TradenityClient client) {
        super(client);
    }

    protected CategoryResource getCategoryResource(){
        if(categoryResource == null) {
            categoryResource = resourceFactory.create(CategoryResource.class);
        }
        return categoryResource;
    }

    public Page<Category> findAll(PageRequest pageRequest){
        Call<ResourcePage<Category>> call =  getCategoryResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Category> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Category>> call =  getCategoryResource().index(params);
        return createPage(call);
    }

    public Category findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Category findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Category> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Category> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Category> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Category> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Category> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Category> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Category> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Category findOne(Map<String, Object> fields){
        List<Category> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Category findById(String id){
        Call<Category> call =  getCategoryResource().findOne(id);
        return createInstance(call);
    }

    public Category create(Category category){
        Call<Category> call =  getCategoryResource().save(category);
        return createInstance(call);
    }

    public Category update(Category category){
        Call<Category> call =  getCategoryResource().update(category.getId(), category);
        return createInstance(call);
    }

    public Category replace(Category category){
        Call<Category> call =  getCategoryResource().replace(category.getId(), category);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getCategoryResource().delete(id);
        run(call);
    }

    public void delete(Category category){
        delete(category.getId());
    }
}