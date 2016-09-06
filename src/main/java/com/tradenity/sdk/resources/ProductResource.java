package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Product;
import com.tradenity.sdk.model.ResourcePage;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface ProductResource {

    @GET("products")
    Call<ResourcePage<Product>> index(@QueryMap Map<String, Object> fields);

    @GET("products/{id}")
    Call<Product> findById(@Path("id") String id);

    @POST("products")
    Call<Product> save(@FieldMap Map<String, Object> fields);

    @PUT("products/{id}")
    Call<Product> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("products/{id}")
    Call<Void> delete(@Path("id") String id);


}
