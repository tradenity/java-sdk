package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Tax;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface TaxResource {

    @GET("taxes")
    Call<ResourcePage<Tax>> index(@QueryMap Map<String, Object> fields);

    @GET("taxes/{id}")
    Call<Tax> findById(@Path("id") String id);

    @POST("taxes")
    Call<Tax> save(@FieldMap Map<String, Object> fields);

    @PUT("taxes/{id}")
    Call<Tax> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("taxes/{id}")
    Call<Void> delete(@Path("id") String id);

}
