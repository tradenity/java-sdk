package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface AddressResource {

    @GET("addresses")
    Call<ResourcePage<Address>> index(@QueryMap Map<String, Object> fields);

    @GET("addresses/{id}")
    Call<Address> findOne(@Path("id") String id);

    @POST("addresses")
    Call<Address> save(@Body Address address);

    @PATCH("addresses/{id}")
    Call<Address> update(@Path("id") String id, @Body Address address);

    @PUT("addresses/{id}")
    Call<Address> replace(@Path("id") String id, @Body Address address);

    @DELETE("addresses/{id}")
    Call<Void> delete(@Path("id") String id);
}