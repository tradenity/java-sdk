package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Address;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface AddressResource {

    @GET("addresses")
    Call<ResourcePage<Address>> index(@QueryMap Map<String, Object> fields);

    @GET("addresses/{id}")
    Call<Address> findById(@Path("id") String id);

    @POST("addresses")
    Call<Address> save(@FieldMap Map<String, Object> fields);

    @PUT("addresses/{id}")
    Call<Address> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("addresses/{id}")
    Call<Void> delete(@Path("id") String id);


}
