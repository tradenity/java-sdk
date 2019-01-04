package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface CustomerResource {

    @GET("customers")
    Call<ResourcePage<Customer>> index(@QueryMap Map<String, Object> fields);

    @GET("customers/{id}")
    Call<Customer> findOne(@Path("id") String id);

    @POST("customers")
    Call<Customer> save(@Body Customer customer);

    @PATCH("customers/{id}")
    Call<Customer> update(@Path("id") String id, @Body Customer customer);

    @PUT("customers/{id}")
    Call<Customer> replace(@Path("id") String id, @Body Customer customer);

    @DELETE("customers/{id}")
    Call<Void> delete(@Path("id") String id);
}