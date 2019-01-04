package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface BrandResource {

    @GET("brands")
    Call<ResourcePage<Brand>> index(@QueryMap Map<String, Object> fields);

    @GET("brands/{id}")
    Call<Brand> findOne(@Path("id") String id);

    @POST("brands")
    Call<Brand> save(@Body Brand brand);

    @PATCH("brands/{id}")
    Call<Brand> update(@Path("id") String id, @Body Brand brand);

    @PUT("brands/{id}")
    Call<Brand> replace(@Path("id") String id, @Body Brand brand);

    @DELETE("brands/{id}")
    Call<Void> delete(@Path("id") String id);
}