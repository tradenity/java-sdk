package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.DiscountCouponResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiscountCouponService extends AbstractService{

    DiscountCouponResource discountCouponResource;

    public DiscountCouponService(TradenityClient client) {
        super(client);
    }

    protected DiscountCouponResource getDiscountCouponResource(){
        if(discountCouponResource == null) {
            discountCouponResource = resourceFactory.create(DiscountCouponResource.class);
        }
        return discountCouponResource;
    }

    public Page<DiscountCoupon> findAll(PageRequest pageRequest){
        Call<ResourcePage<DiscountCoupon>> call =  getDiscountCouponResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<DiscountCoupon> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<DiscountCoupon>> call =  getDiscountCouponResource().index(fields);
        return createPage(call);
    }

    public DiscountCoupon findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public DiscountCoupon findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<DiscountCoupon> findAll(){
        return findAll(new PageRequest());
    }

    public Page<DiscountCoupon> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<DiscountCoupon> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<DiscountCoupon> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<DiscountCoupon> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<DiscountCoupon> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<DiscountCoupon> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public DiscountCoupon findOne(Map<String, Object> fields){
        List<DiscountCoupon> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public DiscountCoupon findById(String id){
        Call<DiscountCoupon> call =  getDiscountCouponResource().findOne(id);
        return createInstance(call);
    }

    public DiscountCoupon create(DiscountCoupon discountCoupon){
        Call<DiscountCoupon> call =  getDiscountCouponResource().save(discountCoupon);
        return createInstance(call);
    }

    public DiscountCoupon update(DiscountCoupon discountCoupon){
        Call<DiscountCoupon> call =  getDiscountCouponResource().update(discountCoupon.getId(), discountCoupon);
        return createInstance(call);
    }

    public DiscountCoupon replace(DiscountCoupon discountCoupon){
        Call<DiscountCoupon> call =  getDiscountCouponResource().replace(discountCoupon.getId(), discountCoupon);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getDiscountCouponResource().delete(id);
        run(call);
    }

    public void delete(DiscountCoupon discountCoupon){
        delete(discountCoupon.getId());
    }
}