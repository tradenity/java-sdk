package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.Checkout;
import com.tradenity.sdk.model.LineItem;
import com.tradenity.sdk.model.ShoppingCart;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 4:42 PM
 */
public interface ShoppingCartResource {

    @GET("shoppingCarts")
    Call<ShoppingCart> index();

    @GET("shoppingCarts/items")
    Call<List<LineItem>> items();

    @GET("shoppingCarts/checkout")
    Call<Checkout> checkout();

    @GET("shoppingCarts/{id}")
    Call<LineItem> findOne(@Path("id") String id);

    @FormUrlEncoded
    @POST("shoppingCarts")
    Call<ShoppingCart> save(@FieldMap Map<String, Object> fields);

    @FormUrlEncoded
    @PUT("shoppingCarts/{id}")
    Call<ShoppingCart> update(@Path("id") String id, @FieldMap Map<String, Object> fields);

    @DELETE("shoppingCarts/{id}")
    Call<ShoppingCart> delete(@Path("id") String id);
}
