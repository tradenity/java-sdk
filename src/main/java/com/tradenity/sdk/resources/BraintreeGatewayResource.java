package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface BraintreeGatewayResource {

    @GET("braintreeGateways")
    Call<ResourcePage<BraintreeGateway>> index(@QueryMap Map<String, Object> fields);

    @GET("braintreeGateways/{id}")
    Call<BraintreeGateway> findOne(@Path("id") String id);

    @POST("braintreeGateways")
    Call<BraintreeGateway> save(@Body BraintreeGateway braintreeGateway);

    @PATCH("braintreeGateways/{id}")
    Call<BraintreeGateway> update(@Path("id") String id, @Body BraintreeGateway braintreeGateway);

    @PUT("braintreeGateways/{id}")
    Call<BraintreeGateway> replace(@Path("id") String id, @Body BraintreeGateway braintreeGateway);

    @DELETE("braintreeGateways/{id}")
    Call<Void> delete(@Path("id") String id);
}