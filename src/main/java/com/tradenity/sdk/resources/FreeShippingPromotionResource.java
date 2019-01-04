package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface FreeShippingPromotionResource {

    @GET("freeShippingPromotions")
    Call<ResourcePage<FreeShippingPromotion>> index(@QueryMap Map<String, Object> fields);

    @GET("freeShippingPromotions/{id}")
    Call<FreeShippingPromotion> findOne(@Path("id") String id);

    @POST("freeShippingPromotions")
    Call<FreeShippingPromotion> save(@Body FreeShippingPromotion freeShippingPromotion);

    @PATCH("freeShippingPromotions/{id}")
    Call<FreeShippingPromotion> update(@Path("id") String id, @Body FreeShippingPromotion freeShippingPromotion);

    @PUT("freeShippingPromotions/{id}")
    Call<FreeShippingPromotion> replace(@Path("id") String id, @Body FreeShippingPromotion freeShippingPromotion);

    @DELETE("freeShippingPromotions/{id}")
    Call<Void> delete(@Path("id") String id);
}