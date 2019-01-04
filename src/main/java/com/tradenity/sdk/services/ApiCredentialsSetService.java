package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.ApiCredentialsSetResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiCredentialsSetService extends AbstractService{

    ApiCredentialsSetResource apiCredentialsSetResource;

    public ApiCredentialsSetService(TradenityClient client) {
        super(client);
    }

    protected ApiCredentialsSetResource getApiCredentialsSetResource(){
        if(apiCredentialsSetResource == null) {
            apiCredentialsSetResource = resourceFactory.create(ApiCredentialsSetResource.class);
        }
        return apiCredentialsSetResource;
    }

    public Page<ApiCredentialsSet> findAll(PageRequest pageRequest){
        Call<ResourcePage<ApiCredentialsSet>> call =  getApiCredentialsSetResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<ApiCredentialsSet> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<ApiCredentialsSet>> call =  getApiCredentialsSetResource().index(fields);
        return createPage(call);
    }

    public ApiCredentialsSet findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public ApiCredentialsSet findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<ApiCredentialsSet> findAll(){
        return findAll(new PageRequest());
    }

    public Page<ApiCredentialsSet> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<ApiCredentialsSet> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<ApiCredentialsSet> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<ApiCredentialsSet> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<ApiCredentialsSet> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<ApiCredentialsSet> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public ApiCredentialsSet findOne(Map<String, Object> fields){
        List<ApiCredentialsSet> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public ApiCredentialsSet findById(String id){
        Call<ApiCredentialsSet> call =  getApiCredentialsSetResource().findOne(id);
        return createInstance(call);
    }

    public ApiCredentialsSet create(ApiCredentialsSet apiCredentialsSet){
        Call<ApiCredentialsSet> call =  getApiCredentialsSetResource().save(apiCredentialsSet);
        return createInstance(call);
    }

    public ApiCredentialsSet update(ApiCredentialsSet apiCredentialsSet){
        Call<ApiCredentialsSet> call =  getApiCredentialsSetResource().update(apiCredentialsSet.getId(), apiCredentialsSet);
        return createInstance(call);
    }

    public ApiCredentialsSet replace(ApiCredentialsSet apiCredentialsSet){
        Call<ApiCredentialsSet> call =  getApiCredentialsSetResource().replace(apiCredentialsSet.getId(), apiCredentialsSet);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getApiCredentialsSetResource().delete(id);
        run(call);
    }

    public void delete(ApiCredentialsSet apiCredentialsSet){
        delete(apiCredentialsSet.getId());
    }
}