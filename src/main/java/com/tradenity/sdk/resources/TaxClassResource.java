package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface TaxClassResource {

    @GET("taxClasses")
    Call<ResourcePage<TaxClass>> index(@QueryMap Map<String, Object> fields);

    @GET("taxClasses/{id}")
    Call<TaxClass> findOne(@Path("id") String id);

    @POST("taxClasses")
    Call<TaxClass> save(@Body TaxClass taxClass);

    @PATCH("taxClasses/{id}")
    Call<TaxClass> update(@Path("id") String id, @Body TaxClass taxClass);

    @PUT("taxClasses/{id}")
    Call<TaxClass> replace(@Path("id") String id, @Body TaxClass taxClass);

    @DELETE("taxClasses/{id}")
    Call<Void> delete(@Path("id") String id);
}