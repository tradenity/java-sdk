package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class TableRateShipping extends ShippingMethod{

    
    public static final String COST_TYPE_ORDER_SUBTOTAL = "orderSubtotal";
    public static final String COST_TYPE_WEIGHT = "weight";
    private String costType;
    private Set<TableRateRule> ranges = new LinkedHashSet<>();

    public TableRateShipping(){
    }
    
    public TableRateShipping id(String id) {
        this.setId(id);
        return this;
    }
    public TableRateShipping name(String name) {
        this.setName(name);
        return this;
    }
    public TableRateShipping slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public TableRateShipping message(String message) {
        this.setMessage(message);
        return this;
    }
    public TableRateShipping description(String description) {
        this.setDescription(description);
        return this;
    }
    public TableRateShipping status(String status) {
        this.setStatus(status);
        return this;
    }
    public TableRateShipping useDiscountedSubtotal(Boolean useDiscountedSubtotal) {
        this.setUseDiscountedSubtotal(useDiscountedSubtotal);
        return this;
    }
    public TableRateShipping includeTaxes(Boolean includeTaxes) {
        this.setIncludeTaxes(includeTaxes);
        return this;
    }
    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }
    
    public TableRateShipping costType(String costType) {
        this.setCostType(costType);
        return this;
    }
    public TableRateShipping geoZone(GeoZone geoZone) {
        this.setGeoZone(geoZone);
        return this;
    }
    public TableRateShipping customerGroups(Set<CustomerGroup> customerGroups) {
        this.setCustomerGroups(customerGroups);
        return this;
    }
    public Set<TableRateRule> getRanges() {
        if(ranges == null){
            this.ranges = new LinkedHashSet<>();
        }
        return ranges;
    }

    public void setRanges(Set<TableRateRule> ranges) {
        this.ranges = ranges;
    }
    
    public TableRateShipping ranges(Set<TableRateRule> ranges) {
        this.setRanges(ranges);
        return this;
    }

}