package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface DiscountCouponResource {

    @GET("discountCoupons")
    Call<ResourcePage<DiscountCoupon>> index(@QueryMap Map<String, Object> fields);

    @GET("discountCoupons/{id}")
    Call<DiscountCoupon> findOne(@Path("id") String id);

    @POST("discountCoupons")
    Call<DiscountCoupon> save(@Body DiscountCoupon discountCoupon);

    @PATCH("discountCoupons/{id}")
    Call<DiscountCoupon> update(@Path("id") String id, @Body DiscountCoupon discountCoupon);

    @PUT("discountCoupons/{id}")
    Call<DiscountCoupon> replace(@Path("id") String id, @Body DiscountCoupon discountCoupon);

    @DELETE("discountCoupons/{id}")
    Call<Void> delete(@Path("id") String id);
}