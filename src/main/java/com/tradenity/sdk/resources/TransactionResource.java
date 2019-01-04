package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface TransactionResource {

    @GET("transactions")
    Call<ResourcePage<Transaction>> index(@QueryMap Map<String, Object> fields);

    @GET("transactions/{id}")
    Call<Transaction> findOne(@Path("id") String id);

    @DELETE("transactions/{id}")
    Call<Void> delete(@Path("id") String id);
}