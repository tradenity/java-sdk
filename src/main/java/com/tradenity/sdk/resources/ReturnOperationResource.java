package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface ReturnOperationResource {

    @GET("returnOperations")
    Call<ResourcePage<ReturnOperation>> index(@QueryMap Map<String, Object> fields);

    @GET("returnOperations/{id}")
    Call<ReturnOperation> findOne(@Path("id") String id);

    @POST("returnOperations")
    Call<ReturnOperation> save(@Body ReturnOperation returnOperation);

    @PATCH("returnOperations/{id}")
    Call<ReturnOperation> update(@Path("id") String id, @Body ReturnOperation returnOperation);

    @PUT("returnOperations/{id}")
    Call<ReturnOperation> replace(@Path("id") String id, @Body ReturnOperation returnOperation);

    @DELETE("returnOperations/{id}")
    Call<Void> delete(@Path("id") String id);
}