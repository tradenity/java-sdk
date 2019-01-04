package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class FixedRateShipping extends ShippingMethod{

    
    public static final String COST_TYPE_PER_ORDER = "perOrder";
    public static final String COST_TYPE_PER_WEIGHT = "perWeight";
    public static final String COST_TYPE_PER_ITEM = "perItem";
    private Integer cost;
    private String costType;

    public FixedRateShipping(){
    }
    
    public FixedRateShipping id(String id) {
        this.setId(id);
        return this;
    }
    public FixedRateShipping name(String name) {
        this.setName(name);
        return this;
    }
    public FixedRateShipping slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public FixedRateShipping message(String message) {
        this.setMessage(message);
        return this;
    }
    public FixedRateShipping description(String description) {
        this.setDescription(description);
        return this;
    }
    public FixedRateShipping status(String status) {
        this.setStatus(status);
        return this;
    }
    public FixedRateShipping useDiscountedSubtotal(Boolean useDiscountedSubtotal) {
        this.setUseDiscountedSubtotal(useDiscountedSubtotal);
        return this;
    }
    public FixedRateShipping includeTaxes(Boolean includeTaxes) {
        this.setIncludeTaxes(includeTaxes);
        return this;
    }
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
    
    public FixedRateShipping cost(Integer cost) {
        this.setCost(cost);
        return this;
    }
    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }
    
    public FixedRateShipping costType(String costType) {
        this.setCostType(costType);
        return this;
    }
    public FixedRateShipping geoZone(GeoZone geoZone) {
        this.setGeoZone(geoZone);
        return this;
    }
    public FixedRateShipping customerGroups(Set<CustomerGroup> customerGroups) {
        this.setCustomerGroups(customerGroups);
        return this;
    }

}