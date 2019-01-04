package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface FixedRateShippingResource {

    @GET("fixedRateShippings")
    Call<ResourcePage<FixedRateShipping>> index(@QueryMap Map<String, Object> fields);

    @GET("fixedRateShippings/{id}")
    Call<FixedRateShipping> findOne(@Path("id") String id);

    @POST("fixedRateShippings")
    Call<FixedRateShipping> save(@Body FixedRateShipping fixedRateShipping);

    @PATCH("fixedRateShippings/{id}")
    Call<FixedRateShipping> update(@Path("id") String id, @Body FixedRateShipping fixedRateShipping);

    @PUT("fixedRateShippings/{id}")
    Call<FixedRateShipping> replace(@Path("id") String id, @Body FixedRateShipping fixedRateShipping);

    @DELETE("fixedRateShippings/{id}")
    Call<Void> delete(@Path("id") String id);
}