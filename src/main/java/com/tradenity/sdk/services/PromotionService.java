package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.PromotionResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromotionService extends AbstractService{

    PromotionResource promotionResource;

    public PromotionService(TradenityClient client) {
        super(client);
    }

    protected PromotionResource getPromotionResource(){
        if(promotionResource == null) {
            promotionResource = resourceFactory.create(PromotionResource.class);
        }
        return promotionResource;
    }

    public Page<Promotion> findAll(PageRequest pageRequest){
        Call<ResourcePage<Promotion>> call =  getPromotionResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Promotion> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Promotion>> call =  getPromotionResource().index(params);
        return createPage(call);
    }

    public Promotion findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Promotion findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Promotion> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Promotion> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Promotion> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Promotion> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Promotion> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Promotion> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Promotion> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Promotion findOne(Map<String, Object> fields){
        List<Promotion> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }
}