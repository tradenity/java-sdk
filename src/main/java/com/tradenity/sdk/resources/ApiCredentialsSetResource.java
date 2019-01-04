package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface ApiCredentialsSetResource {

    @GET("apiCredentialsSets")
    Call<ResourcePage<ApiCredentialsSet>> index(@QueryMap Map<String, Object> fields);

    @GET("apiCredentialsSets/{id}")
    Call<ApiCredentialsSet> findOne(@Path("id") String id);

    @POST("apiCredentialsSets")
    Call<ApiCredentialsSet> save(@Body ApiCredentialsSet apiCredentialsSet);

    @PATCH("apiCredentialsSets/{id}")
    Call<ApiCredentialsSet> update(@Path("id") String id, @Body ApiCredentialsSet apiCredentialsSet);

    @PUT("apiCredentialsSets/{id}")
    Call<ApiCredentialsSet> replace(@Path("id") String id, @Body ApiCredentialsSet apiCredentialsSet);

    @DELETE("apiCredentialsSets/{id}")
    Call<Void> delete(@Path("id") String id);
}