package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface OptionResource {

    @GET("options")
    Call<ResourcePage<Option>> index(@QueryMap Map<String, Object> fields);

    @GET("options/{id}")
    Call<Option> findOne(@Path("id") String id);

    @POST("options")
    Call<Option> save(@Body Option option);

    @PATCH("options/{id}")
    Call<Option> update(@Path("id") String id, @Body Option option);

    @PUT("options/{id}")
    Call<Option> replace(@Path("id") String id, @Body Option option);

    @DELETE("options/{id}")
    Call<Void> delete(@Path("id") String id);
}