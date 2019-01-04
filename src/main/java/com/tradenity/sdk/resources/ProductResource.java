package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface ProductResource {

    @GET("products")
    Call<ResourcePage<Product>> index(@QueryMap Map<String, Object> fields);

    @GET("products/{id}")
    Call<Product> findOne(@Path("id") String id);

    @POST("products")
    Call<Product> save(@Body Product product);

    @PATCH("products/{id}")
    Call<Product> update(@Path("id") String id, @Body Product product);

    @PUT("products/{id}")
    Call<Product> replace(@Path("id") String id, @Body Product product);

    @DELETE("products/{id}")
    Call<Void> delete(@Path("id") String id);
}