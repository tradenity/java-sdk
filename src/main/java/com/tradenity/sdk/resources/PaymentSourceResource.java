package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface PaymentSourceResource {

    @GET("paymentSources")
    Call<ResourcePage<PaymentSource>> index(@QueryMap Map<String, Object> fields);
}