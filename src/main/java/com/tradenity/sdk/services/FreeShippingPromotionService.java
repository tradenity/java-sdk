package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.FreeShippingPromotionResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeShippingPromotionService extends AbstractService{

    FreeShippingPromotionResource freeShippingPromotionResource;

    public FreeShippingPromotionService(TradenityClient client) {
        super(client);
    }

    protected FreeShippingPromotionResource getFreeShippingPromotionResource(){
        if(freeShippingPromotionResource == null) {
            freeShippingPromotionResource = resourceFactory.create(FreeShippingPromotionResource.class);
        }
        return freeShippingPromotionResource;
    }

    public Page<FreeShippingPromotion> findAll(PageRequest pageRequest){
        Call<ResourcePage<FreeShippingPromotion>> call =  getFreeShippingPromotionResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<FreeShippingPromotion> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<FreeShippingPromotion>> call =  getFreeShippingPromotionResource().index(fields);
        return createPage(call);
    }

    public FreeShippingPromotion findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public FreeShippingPromotion findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<FreeShippingPromotion> findAll(){
        return findAll(new PageRequest());
    }

    public Page<FreeShippingPromotion> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<FreeShippingPromotion> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<FreeShippingPromotion> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<FreeShippingPromotion> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<FreeShippingPromotion> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<FreeShippingPromotion> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public FreeShippingPromotion findOne(Map<String, Object> fields){
        List<FreeShippingPromotion> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public FreeShippingPromotion findById(String id){
        Call<FreeShippingPromotion> call =  getFreeShippingPromotionResource().findOne(id);
        return createInstance(call);
    }

    public FreeShippingPromotion create(FreeShippingPromotion freeShippingPromotion){
        Call<FreeShippingPromotion> call =  getFreeShippingPromotionResource().save(freeShippingPromotion);
        return createInstance(call);
    }

    public FreeShippingPromotion update(FreeShippingPromotion freeShippingPromotion){
        Call<FreeShippingPromotion> call =  getFreeShippingPromotionResource().update(freeShippingPromotion.getId(), freeShippingPromotion);
        return createInstance(call);
    }

    public FreeShippingPromotion replace(FreeShippingPromotion freeShippingPromotion){
        Call<FreeShippingPromotion> call =  getFreeShippingPromotionResource().replace(freeShippingPromotion.getId(), freeShippingPromotion);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getFreeShippingPromotionResource().delete(id);
        run(call);
    }

    public void delete(FreeShippingPromotion freeShippingPromotion){
        delete(freeShippingPromotion.getId());
    }
}