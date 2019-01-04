package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface StoreSettingResource {

    @GET("storeSettings/{id}")
    Call<StoreSetting> findOne(@Path("id") String id);

    @PATCH("storeSettings/{id}")
    Call<StoreSetting> update(@Path("id") String id, @Body StoreSetting storeSetting);

    @PUT("storeSettings/{id}")
    Call<StoreSetting> replace(@Path("id") String id, @Body StoreSetting storeSetting);
}