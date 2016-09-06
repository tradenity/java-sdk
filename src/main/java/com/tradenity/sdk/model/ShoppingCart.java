package com.tradenity.sdk.model;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Joseph Fouad
 * Date: 11/4/2015
 * Time: 10:50 PM
 */
public class ShoppingCart extends BaseModel{
    float total;
    float subtotal;
    List<LineItem>items = new ArrayList<>();

    public ShoppingCart() {
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
}
