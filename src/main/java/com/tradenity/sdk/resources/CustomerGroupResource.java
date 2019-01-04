package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface CustomerGroupResource {

    @GET("customerGroups")
    Call<ResourcePage<CustomerGroup>> index(@QueryMap Map<String, Object> fields);

    @GET("customerGroups/{id}")
    Call<CustomerGroup> findOne(@Path("id") String id);

    @POST("customerGroups")
    Call<CustomerGroup> save(@Body CustomerGroup customerGroup);

    @PATCH("customerGroups/{id}")
    Call<CustomerGroup> update(@Path("id") String id, @Body CustomerGroup customerGroup);

    @PUT("customerGroups/{id}")
    Call<CustomerGroup> replace(@Path("id") String id, @Body CustomerGroup customerGroup);

    @DELETE("customerGroups/{id}")
    Call<Void> delete(@Path("id") String id);
}