package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class FreeItemCoupon extends Coupon{

    
    private Integer quantity = 2;
    private Integer freeQuantity = 1;

    public FreeItemCoupon(){
    }
    
    public FreeItemCoupon id(String id) {
        this.setId(id);
        return this;
    }
    public FreeItemCoupon name(String name) {
        this.setName(name);
        return this;
    }
    public FreeItemCoupon description(String description) {
        this.setDescription(description);
        return this;
    }
    public FreeItemCoupon status(String status) {
        this.setStatus(status);
        return this;
    }
    public FreeItemCoupon minimumOrder(Integer minimumOrder) {
        this.setMinimumOrder(minimumOrder);
        return this;
    }
    public FreeItemCoupon code(String code) {
        this.setCode(code);
        return this;
    }
    public FreeItemCoupon beginsAt(Date beginsAt) {
        this.setBeginsAt(beginsAt);
        return this;
    }
    public FreeItemCoupon endsAt(Date endsAt) {
        this.setEndsAt(endsAt);
        return this;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public FreeItemCoupon quantity(Integer quantity) {
        this.setQuantity(quantity);
        return this;
    }
    public Integer getFreeQuantity() {
        return freeQuantity;
    }

    public void setFreeQuantity(Integer freeQuantity) {
        this.freeQuantity = freeQuantity;
    }
    
    public FreeItemCoupon freeQuantity(Integer freeQuantity) {
        this.setFreeQuantity(freeQuantity);
        return this;
    }
    public FreeItemCoupon include(ItemsSelector include) {
        this.setInclude(include);
        return this;
    }

}