package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class FreeShipping extends ShippingMethod{

    
    private Integer minimumOrder = 0;

    public FreeShipping(){
    }
    
    public FreeShipping id(String id) {
        this.setId(id);
        return this;
    }
    public FreeShipping name(String name) {
        this.setName(name);
        return this;
    }
    public FreeShipping slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public FreeShipping message(String message) {
        this.setMessage(message);
        return this;
    }
    public FreeShipping description(String description) {
        this.setDescription(description);
        return this;
    }
    public FreeShipping status(String status) {
        this.setStatus(status);
        return this;
    }
    public FreeShipping useDiscountedSubtotal(Boolean useDiscountedSubtotal) {
        this.setUseDiscountedSubtotal(useDiscountedSubtotal);
        return this;
    }
    public FreeShipping includeTaxes(Boolean includeTaxes) {
        this.setIncludeTaxes(includeTaxes);
        return this;
    }
    public Integer getMinimumOrder() {
        return minimumOrder;
    }

    public void setMinimumOrder(Integer minimumOrder) {
        this.minimumOrder = minimumOrder;
    }
    
    public FreeShipping minimumOrder(Integer minimumOrder) {
        this.setMinimumOrder(minimumOrder);
        return this;
    }
    public FreeShipping geoZone(GeoZone geoZone) {
        this.setGeoZone(geoZone);
        return this;
    }
    public FreeShipping customerGroups(Set<CustomerGroup> customerGroups) {
        this.setCustomerGroups(customerGroups);
        return this;
    }

}