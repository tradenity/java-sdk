package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.FreeItemCouponResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeItemCouponService extends AbstractService{

    FreeItemCouponResource freeItemCouponResource;

    public FreeItemCouponService(TradenityClient client) {
        super(client);
    }

    protected FreeItemCouponResource getFreeItemCouponResource(){
        if(freeItemCouponResource == null) {
            freeItemCouponResource = resourceFactory.create(FreeItemCouponResource.class);
        }
        return freeItemCouponResource;
    }

    public Page<FreeItemCoupon> findAll(PageRequest pageRequest){
        Call<ResourcePage<FreeItemCoupon>> call =  getFreeItemCouponResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<FreeItemCoupon> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<FreeItemCoupon>> call =  getFreeItemCouponResource().index(params);
        return createPage(call);
    }

    public FreeItemCoupon findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public FreeItemCoupon findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<FreeItemCoupon> findAll(){
        return findAll(new PageRequest());
    }

    public Page<FreeItemCoupon> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<FreeItemCoupon> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<FreeItemCoupon> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<FreeItemCoupon> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<FreeItemCoupon> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<FreeItemCoupon> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public FreeItemCoupon findOne(Map<String, Object> fields){
        List<FreeItemCoupon> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public FreeItemCoupon findById(String id){
        Call<FreeItemCoupon> call =  getFreeItemCouponResource().findOne(id);
        return createInstance(call);
    }

    public FreeItemCoupon create(FreeItemCoupon freeItemCoupon){
        Call<FreeItemCoupon> call =  getFreeItemCouponResource().save(freeItemCoupon);
        return createInstance(call);
    }

    public FreeItemCoupon update(FreeItemCoupon freeItemCoupon){
        Call<FreeItemCoupon> call =  getFreeItemCouponResource().update(freeItemCoupon.getId(), freeItemCoupon);
        return createInstance(call);
    }

    public FreeItemCoupon replace(FreeItemCoupon freeItemCoupon){
        Call<FreeItemCoupon> call =  getFreeItemCouponResource().replace(freeItemCoupon.getId(), freeItemCoupon);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getFreeItemCouponResource().delete(id);
        run(call);
    }

    public void delete(FreeItemCoupon freeItemCoupon){
        delete(freeItemCoupon.getId());
    }
}