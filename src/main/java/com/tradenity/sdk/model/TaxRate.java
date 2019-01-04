package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class TaxRate extends BaseModel{

    
    public static final String TYPE_PERCENTAGE = "percentage";
    public static final String TYPE_FIXED = "fixed";
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    public static final String BASED_ON_SHIPPING_ADDRESS = "shippingAddress";
    public static final String BASED_ON_BILLING_ADDRESS = "billingAddress";
    private String name;
    private String description;
    private String type;
    private Float percentage = 0F;
    private Integer fixedRate = 0;
    private String status;
    private String basedOn;
    private TaxClass taxClass;
    private GeoZone geoZone;
    private Set<CustomerGroup> customerGroups = new LinkedHashSet<>();

    public TaxRate(){
    }
    
    public TaxRate id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public TaxRate name(String name) {
        this.setName(name);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public TaxRate description(String description) {
        this.setDescription(description);
        return this;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public TaxRate type(String type) {
        this.setType(type);
        return this;
    }
    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
    
    public TaxRate percentage(Float percentage) {
        this.setPercentage(percentage);
        return this;
    }
    public Integer getFixedRate() {
        return fixedRate;
    }

    public void setFixedRate(Integer fixedRate) {
        this.fixedRate = fixedRate;
    }
    
    public TaxRate fixedRate(Integer fixedRate) {
        this.setFixedRate(fixedRate);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public TaxRate status(String status) {
        this.setStatus(status);
        return this;
    }
    public String getBasedOn() {
        return basedOn;
    }

    public void setBasedOn(String basedOn) {
        this.basedOn = basedOn;
    }
    
    public TaxRate basedOn(String basedOn) {
        this.setBasedOn(basedOn);
        return this;
    }
    public TaxClass getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(TaxClass taxClass) {
        this.taxClass = taxClass;
    }
    
    public TaxRate taxClass(TaxClass taxClass) {
        this.setTaxClass(taxClass);
        return this;
    }
    public GeoZone getGeoZone() {
        return geoZone;
    }

    public void setGeoZone(GeoZone geoZone) {
        this.geoZone = geoZone;
    }
    
    public TaxRate geoZone(GeoZone geoZone) {
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
    
    public TaxRate customerGroups(Set<CustomerGroup> customerGroups) {
        this.setCustomerGroups(customerGroups);
        return this;
    }

}