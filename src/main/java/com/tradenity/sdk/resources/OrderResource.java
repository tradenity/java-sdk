package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Order;
import com.tradenity.sdk.model.ResourcePage;
import com.tradenity.sdk.model.Transaction;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface OrderResource {

    @GET("orders")
    Call<ResourcePage<Order>> index(@QueryMap Map<String, Object> fields);

    @GET("orders/{id}")
    Call<Order> findOne(@Path("id") String id);

    @FormUrlEncoded
    @POST("orders")
    Call<Transaction> create(@FieldMap Map<String, Object> fields);

    @PUT("orders/{id}/refund")
    Call<Transaction> refund(@Path("id") String id);

    @FormUrlEncoded
    @PUT("orders/{id}")
    Call<Order> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("orders/{id}")
    Call<Void> delete(@Path("id") String id);
}
