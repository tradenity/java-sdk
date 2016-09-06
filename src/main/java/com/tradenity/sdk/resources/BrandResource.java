package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Brand;
import com.tradenity.sdk.model.ResourcePage;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface BrandResource {

    @GET("brands")
    Call<ResourcePage<Brand>> index(@QueryMap Map<String, Object> fields);

    @GET("brands/{id}")
    Call<Brand> findOne(@Path("id") String id);

    @POST("brands")
    @FormUrlEncoded
    Call<Brand> save(@FieldMap Map<String, Object> fields);

    @PUT("brands/{id}")
    @FormUrlEncoded
    Call<Brand> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("brands/{id}")
    Call<Void> delete(@Path("id") String id);
}
