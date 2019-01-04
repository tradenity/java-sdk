package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface ShoppingCartResource {

    @GET("shoppingCarts")
    Call<ShoppingCart> get();

    @POST("shoppingCarts")
    Call<ShoppingCart> addItem(@Body LineItem item);

    @PUT("shoppingCarts/{itemId}")
    Call<ShoppingCart> updateItem(@Path("itemId") String itemId, @Body LineItem item);

    @POST("shoppingCarts/checkout")
    Call<Order> checkout(@Body Order order);

    @DELETE("shoppingCarts/{itemId}")
    Call<ShoppingCart> deleteItem(@Path("itemId") String itemId);

    @DELETE("shoppingCarts")
    Call<ShoppingCart> empty();
}