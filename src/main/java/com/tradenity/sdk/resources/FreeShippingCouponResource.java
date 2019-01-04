package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface FreeShippingCouponResource {

    @GET("freeShippingCoupons")
    Call<ResourcePage<FreeShippingCoupon>> index(@QueryMap Map<String, Object> fields);

    @GET("freeShippingCoupons/{id}")
    Call<FreeShippingCoupon> findOne(@Path("id") String id);

    @POST("freeShippingCoupons")
    Call<FreeShippingCoupon> save(@Body FreeShippingCoupon freeShippingCoupon);

    @PATCH("freeShippingCoupons/{id}")
    Call<FreeShippingCoupon> update(@Path("id") String id, @Body FreeShippingCoupon freeShippingCoupon);

    @PUT("freeShippingCoupons/{id}")
    Call<FreeShippingCoupon> replace(@Path("id") String id, @Body FreeShippingCoupon freeShippingCoupon);

    @DELETE("freeShippingCoupons/{id}")
    Call<Void> delete(@Path("id") String id);
}