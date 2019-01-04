package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface CreditCardPaymentResource {

    @GET("creditCardPayments")
    Call<ResourcePage<CreditCardPayment>> index(@QueryMap Map<String, Object> fields);

    @GET("creditCardPayments/{id}")
    Call<CreditCardPayment> findOne(@Path("id") String id);

    @POST("creditCardPayments")
    Call<CreditCardPayment> save(@Body CreditCardPayment creditCardPayment);

    @PATCH("creditCardPayments/{id}")
    Call<CreditCardPayment> update(@Path("id") String id, @Body CreditCardPayment creditCardPayment);

    @PUT("creditCardPayments/{id}")
    Call<CreditCardPayment> replace(@Path("id") String id, @Body CreditCardPayment creditCardPayment);

    @DELETE("creditCardPayments/{id}")
    Call<Void> delete(@Path("id") String id);
}