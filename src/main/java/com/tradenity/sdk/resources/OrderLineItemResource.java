package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface OrderLineItemResource {

    @GET("orderLineItems")
    Call<ResourcePage<OrderLineItem>> index(@QueryMap Map<String, Object> fields);

    @GET("orderLineItems/{id}")
    Call<OrderLineItem> findOne(@Path("id") String id);

    @POST("orderLineItems")
    Call<OrderLineItem> save(@Body OrderLineItem orderLineItem);

    @PATCH("orderLineItems/{id}")
    Call<OrderLineItem> update(@Path("id") String id, @Body OrderLineItem orderLineItem);

    @PUT("orderLineItems/{id}")
    Call<OrderLineItem> replace(@Path("id") String id, @Body OrderLineItem orderLineItem);

    @DELETE("orderLineItems/{id}")
    Call<Void> delete(@Path("id") String id);
}