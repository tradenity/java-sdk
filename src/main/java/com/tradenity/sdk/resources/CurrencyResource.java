package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Currency;
import com.tradenity.sdk.model.ResourcePage;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface CurrencyResource {

    @GET("currencies")
    Call<ResourcePage<Currency>> index(@QueryMap Map<String, Object> fields);

    @GET("currencies/{id}")
    Call<Currency> findById(@Path("id") String id);

    @POST("currencies")
    Call<Currency> save(@FieldMap Map<String, Object> fields);

    @PUT("currencies/{id}")
    Call<Currency> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("currencies/{id}")
    Call<Void> delete(@Path("id") String id);


}
