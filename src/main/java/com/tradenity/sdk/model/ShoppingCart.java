package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class ShoppingCart {

    
    private Integer subtotal = 0;
    private Integer total = 0;
    private Integer shippingCost = 0;
    private Integer itemsTaxAmount = 0;
    private Integer totalItemsDiscount = 0;
    private List<LineItem> items = new ArrayList<>();
    private Set<Promotion> promotions = new LinkedHashSet<>();

    public ShoppingCart(){
    }
    
    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }
    
    public ShoppingCart subtotal(Integer subtotal) {
        this.setSubtotal(subtotal);
        return this;
    }
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    
    public ShoppingCart total(Integer total) {
        this.setTotal(total);
        return this;
    }
    public Integer getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Integer shippingCost) {
        this.shippingCost = shippingCost;
    }
    
    public ShoppingCart shippingCost(Integer shippingCost) {
        this.setShippingCost(shippingCost);
        return this;
    }
    public Integer getItemsTaxAmount() {
        return itemsTaxAmount;
    }

    public void setItemsTaxAmount(Integer itemsTaxAmount) {
        this.itemsTaxAmount = itemsTaxAmount;
    }
    
    public ShoppingCart itemsTaxAmount(Integer itemsTaxAmount) {
        this.setItemsTaxAmount(itemsTaxAmount);
        return this;
    }
    public Integer getTotalItemsDiscount() {
        return totalItemsDiscount;
    }

    public void setTotalItemsDiscount(Integer totalItemsDiscount) {
        this.totalItemsDiscount = totalItemsDiscount;
    }
    
    public ShoppingCart totalItemsDiscount(Integer totalItemsDiscount) {
        this.setTotalItemsDiscount(totalItemsDiscount);
        return this;
    }
    public List<LineItem> getItems() {
        if(items == null){
            this.items = new ArrayList<>();
        }
        return items;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }
    
    public ShoppingCart items(List<LineItem> items) {
        this.setItems(items);
        return this;
    }
    public Set<Promotion> getPromotions() {
        if(promotions == null){
            this.promotions = new LinkedHashSet<>();
        }
        return promotions;
    }

    public void setPromotions(Set<Promotion> promotions) {
        this.promotions = promotions;
    }
    
    public ShoppingCart promotions(Set<Promotion> promotions) {
        this.setPromotions(promotions);
        return this;
    }

}