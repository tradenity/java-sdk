package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface StoreCreditTransactionResource {

    @GET("storeCreditTransactions")
    Call<ResourcePage<StoreCreditTransaction>> index(@QueryMap Map<String, Object> fields);

    @GET("storeCreditTransactions/{id}")
    Call<StoreCreditTransaction> findOne(@Path("id") String id);

    @POST("storeCreditTransactions")
    Call<StoreCreditTransaction> save(@Body StoreCreditTransaction storeCreditTransaction);

    @PATCH("storeCreditTransactions/{id}")
    Call<StoreCreditTransaction> update(@Path("id") String id, @Body StoreCreditTransaction storeCreditTransaction);

    @PUT("storeCreditTransactions/{id}")
    Call<StoreCreditTransaction> replace(@Path("id") String id, @Body StoreCreditTransaction storeCreditTransaction);

    @DELETE("storeCreditTransactions/{id}")
    Call<Void> delete(@Path("id") String id);
}