package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class FreeShippingCoupon extends Coupon{

    
    private Set<GeoZone> geoZones = new LinkedHashSet<>();

    public FreeShippingCoupon(){
    }
    
    public FreeShippingCoupon id(String id) {
        this.setId(id);
        return this;
    }
    public FreeShippingCoupon name(String name) {
        this.setName(name);
        return this;
    }
    public FreeShippingCoupon description(String description) {
        this.setDescription(description);
        return this;
    }
    public FreeShippingCoupon status(String status) {
        this.setStatus(status);
        return this;
    }
    public FreeShippingCoupon minimumOrder(Integer minimumOrder) {
        this.setMinimumOrder(minimumOrder);
        return this;
    }
    public FreeShippingCoupon code(String code) {
        this.setCode(code);
        return this;
    }
    public FreeShippingCoupon beginsAt(Date beginsAt) {
        this.setBeginsAt(beginsAt);
        return this;
    }
    public FreeShippingCoupon endsAt(Date endsAt) {
        this.setEndsAt(endsAt);
        return this;
    }
    public FreeShippingCoupon include(ItemsSelector include) {
        this.setInclude(include);
        return this;
    }
    public Set<GeoZone> getGeoZones() {
        if(geoZones == null){
            this.geoZones = new LinkedHashSet<>();
        }
        return geoZones;
    }

    public void setGeoZones(Set<GeoZone> geoZones) {
        this.geoZones = geoZones;
    }
    
    public FreeShippingCoupon geoZones(Set<GeoZone> geoZones) {
        this.setGeoZones(geoZones);
        return this;
    }

}