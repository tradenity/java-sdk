package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface StoreProfileResource {

    @GET("storeProfiles/{id}")
    Call<StoreProfile> findOne(@Path("id") String id);

    @PATCH("storeProfiles/{id}")
    Call<StoreProfile> update(@Path("id") String id, @Body StoreProfile storeProfile);

    @PUT("storeProfiles/{id}")
    Call<StoreProfile> replace(@Path("id") String id, @Body StoreProfile storeProfile);
}