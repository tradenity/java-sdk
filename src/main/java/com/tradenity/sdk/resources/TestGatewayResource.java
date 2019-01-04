package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface TestGatewayResource {

    @GET("testGateways")
    Call<ResourcePage<TestGateway>> index(@QueryMap Map<String, Object> fields);

    @GET("testGateways/{id}")
    Call<TestGateway> findOne(@Path("id") String id);

    @POST("testGateways")
    Call<TestGateway> save(@Body TestGateway testGateway);

    @PATCH("testGateways/{id}")
    Call<TestGateway> update(@Path("id") String id, @Body TestGateway testGateway);

    @PUT("testGateways/{id}")
    Call<TestGateway> replace(@Path("id") String id, @Body TestGateway testGateway);

    @DELETE("testGateways/{id}")
    Call<Void> delete(@Path("id") String id);
}