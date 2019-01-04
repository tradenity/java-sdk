package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface CategoryResource {

    @GET("categories")
    Call<ResourcePage<Category>> index(@QueryMap Map<String, Object> fields);

    @GET("categories/{id}")
    Call<Category> findOne(@Path("id") String id);

    @POST("categories")
    Call<Category> save(@Body Category category);

    @PATCH("categories/{id}")
    Call<Category> update(@Path("id") String id, @Body Category category);

    @PUT("categories/{id}")
    Call<Category> replace(@Path("id") String id, @Body Category category);

    @DELETE("categories/{id}")
    Call<Void> delete(@Path("id") String id);
}