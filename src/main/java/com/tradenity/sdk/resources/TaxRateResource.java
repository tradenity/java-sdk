package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface TaxRateResource {

    @GET("taxRates")
    Call<ResourcePage<TaxRate>> index(@QueryMap Map<String, Object> fields);

    @GET("taxRates/{id}")
    Call<TaxRate> findOne(@Path("id") String id);

    @POST("taxRates")
    Call<TaxRate> save(@Body TaxRate taxRate);

    @PATCH("taxRates/{id}")
    Call<TaxRate> update(@Path("id") String id, @Body TaxRate taxRate);

    @PUT("taxRates/{id}")
    Call<TaxRate> replace(@Path("id") String id, @Body TaxRate taxRate);

    @DELETE("taxRates/{id}")
    Call<Void> delete(@Path("id") String id);
}