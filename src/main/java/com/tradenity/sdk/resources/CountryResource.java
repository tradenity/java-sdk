package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface CountryResource {

    @GET("countries")
    Call<ResourcePage<Country>> index(@QueryMap Map<String, Object> fields);

    @GET("countries/{id}")
    Call<Country> findOne(@Path("id") String id);

    @POST("countries")
    Call<Country> save(@Body Country country);

    @PATCH("countries/{id}")
    Call<Country> update(@Path("id") String id, @Body Country country);

    @PUT("countries/{id}")
    Call<Country> replace(@Path("id") String id, @Body Country country);

    @DELETE("countries/{id}")
    Call<Void> delete(@Path("id") String id);
}