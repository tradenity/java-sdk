package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface FreeItemCouponResource {

    @GET("freeItemCoupons")
    Call<ResourcePage<FreeItemCoupon>> index(@QueryMap Map<String, Object> fields);

    @GET("freeItemCoupons/{id}")
    Call<FreeItemCoupon> findOne(@Path("id") String id);

    @POST("freeItemCoupons")
    Call<FreeItemCoupon> save(@Body FreeItemCoupon freeItemCoupon);

    @PATCH("freeItemCoupons/{id}")
    Call<FreeItemCoupon> update(@Path("id") String id, @Body FreeItemCoupon freeItemCoupon);

    @PUT("freeItemCoupons/{id}")
    Call<FreeItemCoupon> replace(@Path("id") String id, @Body FreeItemCoupon freeItemCoupon);

    @DELETE("freeItemCoupons/{id}")
    Call<Void> delete(@Path("id") String id);
}