package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface WishListResource {

    @GET("wishLists")
    Call<ResourcePage<WishList>> index(@QueryMap Map<String, Object> fields);

    @GET("wishLists/{id}")
    Call<WishList> findOne(@Path("id") String id);

    @POST("wishLists")
    Call<WishList> save(@Body WishList wishList);

    @PATCH("wishLists/{id}")
    Call<WishList> update(@Path("id") String id, @Body WishList wishList);

    @PUT("wishLists/{id}")
    Call<WishList> replace(@Path("id") String id, @Body WishList wishList);

    @DELETE("wishLists/{id}")
    Call<Void> delete(@Path("id") String id);
}