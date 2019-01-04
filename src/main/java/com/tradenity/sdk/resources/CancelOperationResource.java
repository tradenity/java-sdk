package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface CancelOperationResource {

    @GET("cancelOperations")
    Call<ResourcePage<CancelOperation>> index(@QueryMap Map<String, Object> fields);

    @GET("cancelOperations/{id}")
    Call<CancelOperation> findOne(@Path("id") String id);

    @POST("cancelOperations")
    Call<CancelOperation> save(@Body CancelOperation cancelOperation);

    @PATCH("cancelOperations/{id}")
    Call<CancelOperation> update(@Path("id") String id, @Body CancelOperation cancelOperation);

    @PUT("cancelOperations/{id}")
    Call<CancelOperation> replace(@Path("id") String id, @Body CancelOperation cancelOperation);

    @DELETE("cancelOperations/{id}")
    Call<Void> delete(@Path("id") String id);
}