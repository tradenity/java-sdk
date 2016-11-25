package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.ShippingMethod;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface ShippingMethodResource {

    @GET("shippingMethods")
    Call<ResourcePage<ShippingMethod>> index(@QueryMap Map<String, Object> fields);

    @GET("shippingMethods/{id}")
    Call<ShippingMethod> findById(@Path("id") String id);

    @POST("shippingMethods")
    Call<ShippingMethod> save(@FieldMap Map<String, Object> fields);

    @PUT("shippingMethods/{id}")
    Call<ShippingMethod> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("shippingMethods/{id}")
    Call<Void> delete(@Path("id") String id);


}
