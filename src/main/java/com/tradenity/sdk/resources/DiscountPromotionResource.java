package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface DiscountPromotionResource {

    @GET("discountPromotions")
    Call<ResourcePage<DiscountPromotion>> index(@QueryMap Map<String, Object> fields);

    @GET("discountPromotions/{id}")
    Call<DiscountPromotion> findOne(@Path("id") String id);

    @POST("discountPromotions")
    Call<DiscountPromotion> save(@Body DiscountPromotion discountPromotion);

    @PATCH("discountPromotions/{id}")
    Call<DiscountPromotion> update(@Path("id") String id, @Body DiscountPromotion discountPromotion);

    @PUT("discountPromotions/{id}")
    Call<DiscountPromotion> replace(@Path("id") String id, @Body DiscountPromotion discountPromotion);

    @DELETE("discountPromotions/{id}")
    Call<Void> delete(@Path("id") String id);
}