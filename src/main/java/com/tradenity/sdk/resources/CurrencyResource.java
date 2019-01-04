package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface CurrencyResource {

    @GET("currencies")
    Call<ResourcePage<Currency>> index(@QueryMap Map<String, Object> fields);

    @GET("currencies/{id}")
    Call<Currency> findOne(@Path("id") String id);

    @POST("currencies")
    Call<Currency> save(@Body Currency currency);

    @PATCH("currencies/{id}")
    Call<Currency> update(@Path("id") String id, @Body Currency currency);

    @PUT("currencies/{id}")
    Call<Currency> replace(@Path("id") String id, @Body Currency currency);

    @DELETE("currencies/{id}")
    Call<Void> delete(@Path("id") String id);
}