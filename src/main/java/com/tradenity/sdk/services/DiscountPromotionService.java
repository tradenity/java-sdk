package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.DiscountPromotionResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiscountPromotionService extends AbstractService{

    DiscountPromotionResource discountPromotionResource;

    public DiscountPromotionService(TradenityClient client) {
        super(client);
    }

    protected DiscountPromotionResource getDiscountPromotionResource(){
        if(discountPromotionResource == null) {
            discountPromotionResource = resourceFactory.create(DiscountPromotionResource.class);
        }
        return discountPromotionResource;
    }

    public Page<DiscountPromotion> findAll(PageRequest pageRequest){
        Call<ResourcePage<DiscountPromotion>> call =  getDiscountPromotionResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<DiscountPromotion> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<DiscountPromotion>> call =  getDiscountPromotionResource().index(params);
        return createPage(call);
    }

    public DiscountPromotion findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public DiscountPromotion findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<DiscountPromotion> findAll(){
        return findAll(new PageRequest());
    }

    public Page<DiscountPromotion> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<DiscountPromotion> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<DiscountPromotion> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<DiscountPromotion> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<DiscountPromotion> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<DiscountPromotion> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public DiscountPromotion findOne(Map<String, Object> fields){
        List<DiscountPromotion> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public DiscountPromotion findById(String id){
        Call<DiscountPromotion> call =  getDiscountPromotionResource().findOne(id);
        return createInstance(call);
    }

    public DiscountPromotion create(DiscountPromotion discountPromotion){
        Call<DiscountPromotion> call =  getDiscountPromotionResource().save(discountPromotion);
        return createInstance(call);
    }

    public DiscountPromotion update(DiscountPromotion discountPromotion){
        Call<DiscountPromotion> call =  getDiscountPromotionResource().update(discountPromotion.getId(), discountPromotion);
        return createInstance(call);
    }

    public DiscountPromotion replace(DiscountPromotion discountPromotion){
        Call<DiscountPromotion> call =  getDiscountPromotionResource().replace(discountPromotion.getId(), discountPromotion);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getDiscountPromotionResource().delete(id);
        run(call);
    }

    public void delete(DiscountPromotion discountPromotion){
        delete(discountPromotion.getId());
    }
}