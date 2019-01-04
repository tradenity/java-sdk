package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface PaymentCardResource {

    @GET("paymentCards")
    Call<ResourcePage<PaymentCard>> index(@QueryMap Map<String, Object> fields);

    @GET("paymentCards/{id}")
    Call<PaymentCard> findOne(@Path("id") String id);

    @POST("paymentCards")
    Call<PaymentCard> save(@Body PaymentCard paymentCard);

    @PATCH("paymentCards/{id}")
    Call<PaymentCard> update(@Path("id") String id, @Body PaymentCard paymentCard);

    @PUT("paymentCards/{id}")
    Call<PaymentCard> replace(@Path("id") String id, @Body PaymentCard paymentCard);

    @DELETE("paymentCards/{id}")
    Call<Void> delete(@Path("id") String id);
}