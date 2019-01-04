package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface PaymentTransactionResource {

    @GET("paymentTransactions")
    Call<ResourcePage<PaymentTransaction>> index(@QueryMap Map<String, Object> fields);

    @GET("paymentTransactions/{id}")
    Call<PaymentTransaction> findOne(@Path("id") String id);

    @POST("paymentTransactions")
    Call<PaymentTransaction> save(@Body PaymentTransaction paymentTransaction);

    @PATCH("paymentTransactions/{id}")
    Call<PaymentTransaction> update(@Path("id") String id, @Body PaymentTransaction paymentTransaction);

    @PUT("paymentTransactions/{id}")
    Call<PaymentTransaction> replace(@Path("id") String id, @Body PaymentTransaction paymentTransaction);

    @DELETE("paymentTransactions/{id}")
    Call<Void> delete(@Path("id") String id);
}