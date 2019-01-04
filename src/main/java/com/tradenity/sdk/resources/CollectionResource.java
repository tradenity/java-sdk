package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface CollectionResource {

    @GET("collections")
    Call<ResourcePage<Collection>> index(@QueryMap Map<String, Object> fields);

    @GET("collections/{id}")
    Call<Collection> findOne(@Path("id") String id);

    @POST("collections")
    Call<Collection> save(@Body Collection collection);

    @PATCH("collections/{id}")
    Call<Collection> update(@Path("id") String id, @Body Collection collection);

    @PUT("collections/{id}")
    Call<Collection> replace(@Path("id") String id, @Body Collection collection);

    @DELETE("collections/{id}")
    Call<Void> delete(@Path("id") String id);
}