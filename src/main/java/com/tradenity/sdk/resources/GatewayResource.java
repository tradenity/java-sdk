package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Gateway;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface GatewayResource {

    @GET("gateways")
    Call<ResourcePage<Gateway>> index(@QueryMap Map<String, Object> fields);

    @GET("gateways/{id}")
    Call<Gateway> findById(@Path("id") String id);

    @POST("gateways")
    Call<Gateway> save(@FieldMap Map<String, Object> fields);

    @PUT("gateways/{id}")
    Call<Gateway> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("gateways/{id}")
    Call<Void> delete(@Path("id") String id);


}
