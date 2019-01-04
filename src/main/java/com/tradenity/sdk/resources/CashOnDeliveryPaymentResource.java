package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface CashOnDeliveryPaymentResource {

    @GET("cashOnDeliveryPayments")
    Call<ResourcePage<CashOnDeliveryPayment>> index(@QueryMap Map<String, Object> fields);

    @GET("cashOnDeliveryPayments/{id}")
    Call<CashOnDeliveryPayment> findOne(@Path("id") String id);

    @POST("cashOnDeliveryPayments")
    Call<CashOnDeliveryPayment> save(@Body CashOnDeliveryPayment cashOnDeliveryPayment);

    @PATCH("cashOnDeliveryPayments/{id}")
    Call<CashOnDeliveryPayment> update(@Path("id") String id, @Body CashOnDeliveryPayment cashOnDeliveryPayment);

    @PUT("cashOnDeliveryPayments/{id}")
    Call<CashOnDeliveryPayment> replace(@Path("id") String id, @Body CashOnDeliveryPayment cashOnDeliveryPayment);

    @DELETE("cashOnDeliveryPayments/{id}")
    Call<Void> delete(@Path("id") String id);
}