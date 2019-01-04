package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface TableRateRuleResource {

    @GET("tableRateRules")
    Call<ResourcePage<TableRateRule>> index(@QueryMap Map<String, Object> fields);

    @GET("tableRateRules/{id}")
    Call<TableRateRule> findOne(@Path("id") String id);

    @POST("tableRateRules")
    Call<TableRateRule> save(@Body TableRateRule tableRateRule);

    @PATCH("tableRateRules/{id}")
    Call<TableRateRule> update(@Path("id") String id, @Body TableRateRule tableRateRule);

    @PUT("tableRateRules/{id}")
    Call<TableRateRule> replace(@Path("id") String id, @Body TableRateRule tableRateRule);

    @DELETE("tableRateRules/{id}")
    Call<Void> delete(@Path("id") String id);
}