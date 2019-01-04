package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.ShoppingCartResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCartService extends AbstractService{

    ShoppingCartResource shoppingCartResource;

    public ShoppingCartService(TradenityClient client) {
        super(client);
    }

    protected ShoppingCartResource getShoppingCartResource(){
        if(shoppingCartResource == null) {
            shoppingCartResource = resourceFactory.create(ShoppingCartResource.class);
        }
        return shoppingCartResource;
    }

    public ShoppingCart get(){
        Call<ShoppingCart> call =  getShoppingCartResource().get();
        return createInstance(call);
    }

    public ShoppingCart addItem(LineItem item){
        Call<ShoppingCart> call =  getShoppingCartResource().addItem(item);
        return createInstance(call);
    }

    public ShoppingCart updateItem(String itemId, LineItem item){
        Call<ShoppingCart> call =  getShoppingCartResource().updateItem(itemId, item);
        return createInstance(call);
    }

    public Order checkout(Order order){
        Call<Order> call =  getShoppingCartResource().checkout(order);
        return createInstance(call);
    }

    public ShoppingCart deleteItem(String itemId){
        Call<ShoppingCart> call =  getShoppingCartResource().deleteItem(itemId);
        return createInstance(call);
    }

    public ShoppingCart empty(){
        Call<ShoppingCart> call =  getShoppingCartResource().empty();
        return createInstance(call);
    }
}