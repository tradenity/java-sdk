package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Customer;
import com.tradenity.sdk.model.ResourcePage;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface CustomerResource {

    @GET("customers")
    Call<ResourcePage<Customer>> index(@QueryMap Map<String, Object> fields);

    @GET("customers/{id}")
    Call<Customer> findOne(@Path("id") String id);

    @POST("customers")
    @FormUrlEncoded
    Call<Customer> save(@FieldMap Map<String, Object> fields);

    @PUT("customers/{id}")
    @FormUrlEncoded
    Call<Customer> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("customers/{id}")
    Call<Void> delete(@Path("id") String id);
}
