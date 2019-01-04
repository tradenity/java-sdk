package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface RefundTransactionResource {

    @GET("refundTransactions")
    Call<ResourcePage<RefundTransaction>> index(@QueryMap Map<String, Object> fields);

    @GET("refundTransactions/{id}")
    Call<RefundTransaction> findOne(@Path("id") String id);

    @POST("refundTransactions")
    Call<RefundTransaction> save(@Body RefundTransaction refundTransaction);

    @PATCH("refundTransactions/{id}")
    Call<RefundTransaction> update(@Path("id") String id, @Body RefundTransaction refundTransaction);

    @PUT("refundTransactions/{id}")
    Call<RefundTransaction> replace(@Path("id") String id, @Body RefundTransaction refundTransaction);

    @DELETE("refundTransactions/{id}")
    Call<Void> delete(@Path("id") String id);
}