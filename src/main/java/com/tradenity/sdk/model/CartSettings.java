package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class CartSettings {

    
    public static final String AUTO_CLEAR_SHOPPING_CART_NEVER = "never";
    public static final String AUTO_CLEAR_SHOPPING_CART_ORDER_CREATED = "orderCreated";
    public static final String AUTO_CLEAR_SHOPPING_CART_ORDER_COMPLETED = "orderCompleted";
    private String autoClearShoppingCart = "orderCompleted";

    public CartSettings(){
    }
    
    public String getAutoClearShoppingCart() {
        return autoClearShoppingCart;
    }

    public void setAutoClearShoppingCart(String autoClearShoppingCart) {
        this.autoClearShoppingCart = autoClearShoppingCart;
    }
    
    public CartSettings autoClearShoppingCart(String autoClearShoppingCart) {
        this.setAutoClearShoppingCart(autoClearShoppingCart);
        return this;
    }

}