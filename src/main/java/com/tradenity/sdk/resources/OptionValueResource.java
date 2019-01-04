package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface OptionValueResource {

    @GET("optionValues")
    Call<ResourcePage<OptionValue>> index(@QueryMap Map<String, Object> fields);

    @GET("optionValues/{id}")
    Call<OptionValue> findOne(@Path("id") String id);

    @POST("optionValues")
    Call<OptionValue> save(@Body OptionValue optionValue);

    @PATCH("optionValues/{id}")
    Call<OptionValue> update(@Path("id") String id, @Body OptionValue optionValue);

    @PUT("optionValues/{id}")
    Call<OptionValue> replace(@Path("id") String id, @Body OptionValue optionValue);

    @DELETE("optionValues/{id}")
    Call<Void> delete(@Path("id") String id);
}