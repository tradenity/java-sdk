package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.FreeShippingCouponResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeShippingCouponService extends AbstractService{

    FreeShippingCouponResource freeShippingCouponResource;

    public FreeShippingCouponService(TradenityClient client) {
        super(client);
    }

    protected FreeShippingCouponResource getFreeShippingCouponResource(){
        if(freeShippingCouponResource == null) {
            freeShippingCouponResource = resourceFactory.create(FreeShippingCouponResource.class);
        }
        return freeShippingCouponResource;
    }

    public Page<FreeShippingCoupon> findAll(PageRequest pageRequest){
        Call<ResourcePage<FreeShippingCoupon>> call =  getFreeShippingCouponResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<FreeShippingCoupon> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<FreeShippingCoupon>> call =  getFreeShippingCouponResource().index(fields);
        return createPage(call);
    }

    public FreeShippingCoupon findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public FreeShippingCoupon findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<FreeShippingCoupon> findAll(){
        return findAll(new PageRequest());
    }

    public Page<FreeShippingCoupon> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<FreeShippingCoupon> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<FreeShippingCoupon> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<FreeShippingCoupon> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<FreeShippingCoupon> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<FreeShippingCoupon> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public FreeShippingCoupon findOne(Map<String, Object> fields){
        List<FreeShippingCoupon> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public FreeShippingCoupon findById(String id){
        Call<FreeShippingCoupon> call =  getFreeShippingCouponResource().findOne(id);
        return createInstance(call);
    }

    public FreeShippingCoupon create(FreeShippingCoupon freeShippingCoupon){
        Call<FreeShippingCoupon> call =  getFreeShippingCouponResource().save(freeShippingCoupon);
        return createInstance(call);
    }

    public FreeShippingCoupon update(FreeShippingCoupon freeShippingCoupon){
        Call<FreeShippingCoupon> call =  getFreeShippingCouponResource().update(freeShippingCoupon.getId(), freeShippingCoupon);
        return createInstance(call);
    }

    public FreeShippingCoupon replace(FreeShippingCoupon freeShippingCoupon){
        Call<FreeShippingCoupon> call =  getFreeShippingCouponResource().replace(freeShippingCoupon.getId(), freeShippingCoupon);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getFreeShippingCouponResource().delete(id);
        run(call);
    }

    public void delete(FreeShippingCoupon freeShippingCoupon){
        delete(freeShippingCoupon.getId());
    }
}