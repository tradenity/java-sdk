package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class LineItem extends BaseModel{

    
    private Integer unitPrice = 0;
    private Integer quantity = 0;
    private Integer subtotal = 0;
    private Integer total = 0;
    private Integer shippingAmount = 0;
    private Integer taxAmount = 0;
    private Integer discountAmount = 0;
    private Product product;
    private Set<TaxRate> taxes = new LinkedHashSet<>();
    private Set<Promotion> promotions = new LinkedHashSet<>();

    public LineItem(){
    }
    
    public LineItem id(String id) {
        this.setId(id);
        return this;
    }
    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public LineItem unitPrice(Integer unitPrice) {
        this.setUnitPrice(unitPrice);
        return this;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public LineItem quantity(Integer quantity) {
        this.setQuantity(quantity);
        return this;
    }
    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }
    
    public LineItem subtotal(Integer subtotal) {
        this.setSubtotal(subtotal);
        return this;
    }
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    
    public LineItem total(Integer total) {
        this.setTotal(total);
        return this;
    }
    public Integer getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(Integer shippingAmount) {
        this.shippingAmount = shippingAmount;
    }
    
    public LineItem shippingAmount(Integer shippingAmount) {
        this.setShippingAmount(shippingAmount);
        return this;
    }
    public Integer getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Integer taxAmount) {
        this.taxAmount = taxAmount;
    }
    
    public LineItem taxAmount(Integer taxAmount) {
        this.setTaxAmount(taxAmount);
        return this;
    }
    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }
    
    public LineItem discountAmount(Integer discountAmount) {
        this.setDiscountAmount(discountAmount);
        return this;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public LineItem product(Product product) {
        this.setProduct(product);
        return this;
    }
    public Set<TaxRate> getTaxes() {
        if(taxes == null){
            this.taxes = new LinkedHashSet<>();
        }
        return taxes;
    }

    public void setTaxes(Set<TaxRate> taxes) {
        this.taxes = taxes;
    }
    
    public LineItem taxes(Set<TaxRate> taxes) {
        this.setTaxes(taxes);
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
    
    public LineItem promotions(Set<Promotion> promotions) {
        this.setPromotions(promotions);
        return this;
    }

}