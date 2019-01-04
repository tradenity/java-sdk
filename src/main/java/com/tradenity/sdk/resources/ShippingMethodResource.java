package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface ShippingMethodResource {

    @GET("shippingMethods")
    Call<ResourcePage<ShippingMethod>> index(@QueryMap Map<String, Object> fields);

    @GET("shippingMethods/order/{orderId}")
    Call<List<ShippingMethod>> findAllForOrder(@Path("orderId") String orderId);
}