package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface ReturnLineItemResource {

    @GET("returnLineItems")
    Call<ResourcePage<ReturnLineItem>> index(@QueryMap Map<String, Object> fields);

    @GET("returnLineItems/{id}")
    Call<ReturnLineItem> findOne(@Path("id") String id);

    @POST("returnLineItems")
    Call<ReturnLineItem> save(@Body ReturnLineItem returnLineItem);

    @PATCH("returnLineItems/{id}")
    Call<ReturnLineItem> update(@Path("id") String id, @Body ReturnLineItem returnLineItem);

    @PUT("returnLineItems/{id}")
    Call<ReturnLineItem> replace(@Path("id") String id, @Body ReturnLineItem returnLineItem);

    @DELETE("returnLineItems/{id}")
    Call<Void> delete(@Path("id") String id);
}