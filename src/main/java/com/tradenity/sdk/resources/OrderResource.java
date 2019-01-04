package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface OrderResource {

    @GET("orders")
    Call<ResourcePage<Order>> index(@QueryMap Map<String, Object> fields);

    @GET("orders/{id}")
    Call<Order> findOne(@Path("id") String id);

    @POST("orders")
    Call<Order> save(@Body Order order);

    @PATCH("orders/{id}")
    Call<Order> update(@Path("id") String id, @Body Order order);

    @PUT("orders/{id}")
    Call<Order> replace(@Path("id") String id, @Body Order order);

    @DELETE("orders/{id}")
    Call<Void> delete(@Path("id") String id);
}