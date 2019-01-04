package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class OrderLineItem extends LineItem{

    
    private Order order;

    public OrderLineItem(){
    }
    
    public OrderLineItem id(String id) {
        this.setId(id);
        return this;
    }
    public OrderLineItem unitPrice(Integer unitPrice) {
        this.setUnitPrice(unitPrice);
        return this;
    }
    public OrderLineItem quantity(Integer quantity) {
        this.setQuantity(quantity);
        return this;
    }
    public OrderLineItem subtotal(Integer subtotal) {
        this.setSubtotal(subtotal);
        return this;
    }
    public OrderLineItem total(Integer total) {
        this.setTotal(total);
        return this;
    }
    public OrderLineItem shippingAmount(Integer shippingAmount) {
        this.setShippingAmount(shippingAmount);
        return this;
    }
    public OrderLineItem taxAmount(Integer taxAmount) {
        this.setTaxAmount(taxAmount);
        return this;
    }
    public OrderLineItem discountAmount(Integer discountAmount) {
        this.setDiscountAmount(discountAmount);
        return this;
    }
    public OrderLineItem product(Product product) {
        this.setProduct(product);
        return this;
    }
    public OrderLineItem taxes(Set<TaxRate> taxes) {
        this.setTaxes(taxes);
        return this;
    }
    public OrderLineItem promotions(Set<Promotion> promotions) {
        this.setPromotions(promotions);
        return this;
    }
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    public OrderLineItem order(Order order) {
        this.setOrder(order);
        return this;
    }

}