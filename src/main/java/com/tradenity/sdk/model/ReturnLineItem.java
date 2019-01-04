package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class ReturnLineItem extends LineItem{

    
    private ReturnOperation returnOperation;

    public ReturnLineItem(){
    }
    
    public ReturnLineItem id(String id) {
        this.setId(id);
        return this;
    }
    public ReturnLineItem unitPrice(Integer unitPrice) {
        this.setUnitPrice(unitPrice);
        return this;
    }
    public ReturnLineItem quantity(Integer quantity) {
        this.setQuantity(quantity);
        return this;
    }
    public ReturnLineItem subtotal(Integer subtotal) {
        this.setSubtotal(subtotal);
        return this;
    }
    public ReturnLineItem total(Integer total) {
        this.setTotal(total);
        return this;
    }
    public ReturnLineItem shippingAmount(Integer shippingAmount) {
        this.setShippingAmount(shippingAmount);
        return this;
    }
    public ReturnLineItem taxAmount(Integer taxAmount) {
        this.setTaxAmount(taxAmount);
        return this;
    }
    public ReturnLineItem discountAmount(Integer discountAmount) {
        this.setDiscountAmount(discountAmount);
        return this;
    }
    public ReturnLineItem product(Product product) {
        this.setProduct(product);
        return this;
    }
    public ReturnLineItem taxes(Set<TaxRate> taxes) {
        this.setTaxes(taxes);
        return this;
    }
    public ReturnLineItem promotions(Set<Promotion> promotions) {
        this.setPromotions(promotions);
        return this;
    }
    public ReturnOperation getReturnOperation() {
        return returnOperation;
    }

    public void setReturnOperation(ReturnOperation returnOperation) {
        this.returnOperation = returnOperation;
    }
    
    public ReturnLineItem returnOperation(ReturnOperation returnOperation) {
        this.setReturnOperation(returnOperation);
        return this;
    }

}