package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Category;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface CategoryResource {

    @GET("categories")
    Call<ResourcePage<Category>> index(@QueryMap Map<String, Object> fields);

    @GET("categories/{id}")
    Call<Category> findOne(@Path("id") String id);

    @POST("categories")
    @FormUrlEncoded
    Call<Category> save(@FieldMap Map<String, Object> fields);

    @PUT("categories/{id}")
    @FormUrlEncoded
    Call<Category> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("categories/{id}")
    Call<Void> delete(@Path("id") String id);
}
