package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Collection;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface CollectionResource {

    @GET("collections")
    Call<ResourcePage<Collection>> index(@QueryMap Map<String, Object> fields);

    @GET("collections/{id}")
    Call<Collection> findOne(@Path("id") String id);

    @POST("collections")
    @FormUrlEncoded
    Call<Collection> save(@FieldMap Map<String, Object> fields);

    @PUT("collections/{id}")
    @FormUrlEncoded
    Call<Collection> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("collections/{id}")
    Call<Void> delete(@Path("id") String id);
}
