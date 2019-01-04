package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface StoreCreditPaymentResource {

    @GET("storeCreditPayments")
    Call<ResourcePage<StoreCreditPayment>> index(@QueryMap Map<String, Object> fields);

    @GET("storeCreditPayments/{id}")
    Call<StoreCreditPayment> findOne(@Path("id") String id);

    @POST("storeCreditPayments")
    Call<StoreCreditPayment> save(@Body StoreCreditPayment storeCreditPayment);

    @PATCH("storeCreditPayments/{id}")
    Call<StoreCreditPayment> update(@Path("id") String id, @Body StoreCreditPayment storeCreditPayment);

    @PUT("storeCreditPayments/{id}")
    Call<StoreCreditPayment> replace(@Path("id") String id, @Body StoreCreditPayment storeCreditPayment);

    @DELETE("storeCreditPayments/{id}")
    Call<Void> delete(@Path("id") String id);
}