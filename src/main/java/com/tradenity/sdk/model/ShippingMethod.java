package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class ShippingMethod extends BaseModel{

    
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    private String name;
    private String slug;
    private String message;
    private String description;
    private String status;
    private Boolean useDiscountedSubtotal;
    private Boolean includeTaxes;
    private GeoZone geoZone;
    private Set<CustomerGroup> customerGroups = new LinkedHashSet<>();

    public ShippingMethod(){
    }
    
    public ShippingMethod id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public ShippingMethod name(String name) {
        this.setName(name);
        return this;
    }
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
    
    public ShippingMethod slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public ShippingMethod message(String message) {
        this.setMessage(message);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public ShippingMethod description(String description) {
        this.setDescription(description);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public ShippingMethod status(String status) {
        this.setStatus(status);
        return this;
    }
    public Boolean getUseDiscountedSubtotal() {
        return useDiscountedSubtotal;
    }

    public void setUseDiscountedSubtotal(Boolean useDiscountedSubtotal) {
        this.useDiscountedSubtotal = useDiscountedSubtotal;
    }
    
    public ShippingMethod useDiscountedSubtotal(Boolean useDiscountedSubtotal) {
        this.setUseDiscountedSubtotal(useDiscountedSubtotal);
        return this;
    }
    public Boolean getIncludeTaxes() {
        return includeTaxes;
    }

    public void setIncludeTaxes(Boolean includeTaxes) {
        this.includeTaxes = includeTaxes;
    }
    
    public ShippingMethod includeTaxes(Boolean includeTaxes) {
        this.setIncludeTaxes(includeTaxes);
        return this;
    }
    public GeoZone getGeoZone() {
        return geoZone;
    }

    public void setGeoZone(GeoZone geoZone) {
        this.geoZone = geoZone;
    }
    
    public ShippingMethod geoZone(GeoZone geoZone) {
        this.setGeoZone(geoZone);
        return this;
    }
    public Set<CustomerGroup> getCustomerGroups() {
        if(customerGroups == null){
            this.customerGroups = new LinkedHashSet<>();
        }
        return customerGroups;
    }

    public void setCustomerGroups(Set<CustomerGroup> customerGroups) {
        this.customerGroups = customerGroups;
    }
    
    public ShippingMethod customerGroups(Set<CustomerGroup> customerGroups) {
        this.setCustomerGroups(customerGroups);
        return this;
    }

}