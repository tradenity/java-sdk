package com.tradenity.sdk.model;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 11/4/2015
 * Time: 10:50 PM
 */
public class LineItem extends BaseModel{

    Product product;
    int quantity;
    float unitPrice;
    float total;
    float subtotal;
    float taxes;
    float shippingCost;

    public LineItem() {
    }

    public LineItem(String itemId, Integer quantity) {
        this.id = itemId;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
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

    public float getTaxes() {
        return taxes;
    }

    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }

    public float getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(float shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> m = new HashMap<>();
        if(this.getId() != null) {
            m.put("id", this.getId());
        }
        if(this.getProduct() != null) {
            m.put("product", this.getProduct().getId());
        }
        m.put("quantity", this.getQuantity());
        return m;
    }
}
