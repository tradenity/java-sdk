package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface PaymentTokenResource {

    @GET("paymentTokens")
    Call<ResourcePage<PaymentToken>> index(@QueryMap Map<String, Object> fields);

    @GET("paymentTokens/{id}")
    Call<PaymentToken> findOne(@Path("id") String id);

    @POST("paymentTokens")
    Call<PaymentToken> save(@Body PaymentToken paymentToken);

    @PATCH("paymentTokens/{id}")
    Call<PaymentToken> update(@Path("id") String id, @Body PaymentToken paymentToken);

    @PUT("paymentTokens/{id}")
    Call<PaymentToken> replace(@Path("id") String id, @Body PaymentToken paymentToken);

    @DELETE("paymentTokens/{id}")
    Call<Void> delete(@Path("id") String id);
}