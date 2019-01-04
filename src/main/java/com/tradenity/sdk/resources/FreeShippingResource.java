package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface FreeShippingResource {

    @GET("freeShippings")
    Call<ResourcePage<FreeShipping>> index(@QueryMap Map<String, Object> fields);

    @GET("freeShippings/{id}")
    Call<FreeShipping> findOne(@Path("id") String id);

    @POST("freeShippings")
    Call<FreeShipping> save(@Body FreeShipping freeShipping);

    @PATCH("freeShippings/{id}")
    Call<FreeShipping> update(@Path("id") String id, @Body FreeShipping freeShipping);

    @PUT("freeShippings/{id}")
    Call<FreeShipping> replace(@Path("id") String id, @Body FreeShipping freeShipping);

    @DELETE("freeShippings/{id}")
    Call<Void> delete(@Path("id") String id);
}