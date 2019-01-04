package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface StoreCreditResource {

    @GET("storeCredits")
    Call<ResourcePage<StoreCredit>> index(@QueryMap Map<String, Object> fields);

    @GET("storeCredits/{id}")
    Call<StoreCredit> findOne(@Path("id") String id);

    @POST("storeCredits")
    Call<StoreCredit> save(@Body StoreCredit storeCredit);

    @PATCH("storeCredits/{id}")
    Call<StoreCredit> update(@Path("id") String id, @Body StoreCredit storeCredit);

    @PUT("storeCredits/{id}")
    Call<StoreCredit> replace(@Path("id") String id, @Body StoreCredit storeCredit);

    @DELETE("storeCredits/{id}")
    Call<Void> delete(@Path("id") String id);
}