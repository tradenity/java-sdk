package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface VariantResource {

    @GET("variants")
    Call<ResourcePage<Variant>> index(@QueryMap Map<String, Object> fields);

    @GET("variants/{id}")
    Call<Variant> findOne(@Path("id") String id);

    @POST("variants")
    Call<Variant> save(@Body Variant variant);

    @PATCH("variants/{id}")
    Call<Variant> update(@Path("id") String id, @Body Variant variant);

    @PUT("variants/{id}")
    Call<Variant> replace(@Path("id") String id, @Body Variant variant);

    @DELETE("variants/{id}")
    Call<Void> delete(@Path("id") String id);
}