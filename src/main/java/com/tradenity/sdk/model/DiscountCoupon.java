package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class DiscountCoupon extends Coupon{

    
    public static final String TYPE_PERCENTAGE = "percentage";
    public static final String TYPE_FIXED_RATE = "fixedRate";
    private String type;
    private Integer amount;

    public DiscountCoupon(){
    }
    
    public DiscountCoupon id(String id) {
        this.setId(id);
        return this;
    }
    public DiscountCoupon name(String name) {
        this.setName(name);
        return this;
    }
    public DiscountCoupon description(String description) {
        this.setDescription(description);
        return this;
    }
    public DiscountCoupon status(String status) {
        this.setStatus(status);
        return this;
    }
    public DiscountCoupon minimumOrder(Integer minimumOrder) {
        this.setMinimumOrder(minimumOrder);
        return this;
    }
    public DiscountCoupon code(String code) {
        this.setCode(code);
        return this;
    }
    public DiscountCoupon beginsAt(Date beginsAt) {
        this.setBeginsAt(beginsAt);
        return this;
    }
    public DiscountCoupon endsAt(Date endsAt) {
        this.setEndsAt(endsAt);
        return this;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public DiscountCoupon type(String type) {
        this.setType(type);
        return this;
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
    public DiscountCoupon amount(Integer amount) {
        this.setAmount(amount);
        return this;
    }
    public DiscountCoupon include(ItemsSelector include) {
        this.setInclude(include);
        return this;
    }

}