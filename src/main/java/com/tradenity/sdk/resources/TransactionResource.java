package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Transaction;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface TransactionResource {

    @GET("transactions")
    Call<ResourcePage<Transaction>> index(@QueryMap Map<String, Object> fields);

    @GET("transactions/{id}")
    Call<Transaction> findById(@Path("id") String id);

    @POST("transactions")
    Call<Transaction> save(@FieldMap Map<String, Object> fields);

    @PUT("transactions/{id}")
    Call<Transaction> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("transactions/{id}")
    Call<Void> delete(@Path("id") String id);


}
