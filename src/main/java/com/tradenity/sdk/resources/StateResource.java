package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface StateResource {

    @GET("states")
    Call<ResourcePage<State>> index(@QueryMap Map<String, Object> fields);

    @GET("states/{id}")
    Call<State> findOne(@Path("id") String id);

    @POST("states")
    Call<State> save(@Body State state);

    @PATCH("states/{id}")
    Call<State> update(@Path("id") String id, @Body State state);

    @PUT("states/{id}")
    Call<State> replace(@Path("id") String id, @Body State state);

    @DELETE("states/{id}")
    Call<Void> delete(@Path("id") String id);
}