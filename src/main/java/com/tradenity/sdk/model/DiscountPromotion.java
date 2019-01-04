package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class DiscountPromotion extends Promotion{

    
    public static final String TYPE_PERCENTAGE = "percentage";
    public static final String TYPE_FIXED_RATE = "fixedRate";
    private String type;
    private Integer amount;

    public DiscountPromotion(){
    }
    
    public DiscountPromotion id(String id) {
        this.setId(id);
        return this;
    }
    public DiscountPromotion name(String name) {
        this.setName(name);
        return this;
    }
    public DiscountPromotion description(String description) {
        this.setDescription(description);
        return this;
    }
    public DiscountPromotion status(String status) {
        this.setStatus(status);
        return this;
    }
    public DiscountPromotion beginsAt(Date beginsAt) {
        this.setBeginsAt(beginsAt);
        return this;
    }
    public DiscountPromotion endsAt(Date endsAt) {
        this.setEndsAt(endsAt);
        return this;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public DiscountPromotion type(String type) {
        this.setType(type);
        return this;
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
    public DiscountPromotion amount(Integer amount) {
        this.setAmount(amount);
        return this;
    }
    public DiscountPromotion include(ItemsSelector include) {
        this.setInclude(include);
        return this;
    }

}