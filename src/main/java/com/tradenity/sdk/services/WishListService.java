package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.WishListResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WishListService extends AbstractService{

    WishListResource wishListResource;

    public WishListService(TradenityClient client) {
        super(client);
    }

    protected WishListResource getWishListResource(){
        if(wishListResource == null) {
            wishListResource = resourceFactory.create(WishListResource.class);
        }
        return wishListResource;
    }

    public Page<WishList> findAll(PageRequest pageRequest){
        Call<ResourcePage<WishList>> call =  getWishListResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<WishList> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<WishList>> call =  getWishListResource().index(fields);
        return createPage(call);
    }

    public WishList findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public WishList findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<WishList> findAll(){
        return findAll(new PageRequest());
    }

    public Page<WishList> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<WishList> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<WishList> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<WishList> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<WishList> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<WishList> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public WishList findOne(Map<String, Object> fields){
        List<WishList> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public WishList findById(String id){
        Call<WishList> call =  getWishListResource().findOne(id);
        return createInstance(call);
    }

    public WishList create(WishList wishList){
        Call<WishList> call =  getWishListResource().save(wishList);
        return createInstance(call);
    }

    public WishList update(WishList wishList){
        Call<WishList> call =  getWishListResource().update(wishList.getId(), wishList);
        return createInstance(call);
    }

    public WishList replace(WishList wishList){
        Call<WishList> call =  getWishListResource().replace(wishList.getId(), wishList);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getWishListResource().delete(id);
        run(call);
    }

    public void delete(WishList wishList){
        delete(wishList.getId());
    }
}