package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface StripeGatewayResource {

    @GET("stripeGateways")
    Call<ResourcePage<StripeGateway>> index(@QueryMap Map<String, Object> fields);

    @GET("stripeGateways/{id}")
    Call<StripeGateway> findOne(@Path("id") String id);

    @POST("stripeGateways")
    Call<StripeGateway> save(@Body StripeGateway stripeGateway);

    @PATCH("stripeGateways/{id}")
    Call<StripeGateway> update(@Path("id") String id, @Body StripeGateway stripeGateway);

    @PUT("stripeGateways/{id}")
    Call<StripeGateway> replace(@Path("id") String id, @Body StripeGateway stripeGateway);

    @DELETE("stripeGateways/{id}")
    Call<Void> delete(@Path("id") String id);
}