package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface OptionSetResource {

    @GET("optionSets")
    Call<ResourcePage<OptionSet>> index(@QueryMap Map<String, Object> fields);

    @GET("optionSets/{id}")
    Call<OptionSet> findOne(@Path("id") String id);

    @POST("optionSets")
    Call<OptionSet> save(@Body OptionSet optionSet);

    @PATCH("optionSets/{id}")
    Call<OptionSet> update(@Path("id") String id, @Body OptionSet optionSet);

    @PUT("optionSets/{id}")
    Call<OptionSet> replace(@Path("id") String id, @Body OptionSet optionSet);

    @DELETE("optionSets/{id}")
    Call<Void> delete(@Path("id") String id);
}