package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface TableRateShippingResource {

    @GET("tableRateShippings")
    Call<ResourcePage<TableRateShipping>> index(@QueryMap Map<String, Object> fields);

    @GET("tableRateShippings/{id}")
    Call<TableRateShipping> findOne(@Path("id") String id);

    @POST("tableRateShippings")
    Call<TableRateShipping> save(@Body TableRateShipping tableRateShipping);

    @PATCH("tableRateShippings/{id}")
    Call<TableRateShipping> update(@Path("id") String id, @Body TableRateShipping tableRateShipping);

    @PUT("tableRateShippings/{id}")
    Call<TableRateShipping> replace(@Path("id") String id, @Body TableRateShipping tableRateShipping);

    @DELETE("tableRateShippings/{id}")
    Call<Void> delete(@Path("id") String id);
}