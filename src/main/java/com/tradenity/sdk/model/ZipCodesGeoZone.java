package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class ZipCodesGeoZone extends GeoZone{

    
    private String zipCodes;
    private Country country;

    public ZipCodesGeoZone(){
    }
    
    public ZipCodesGeoZone id(String id) {
        this.setId(id);
        return this;
    }
    public ZipCodesGeoZone name(String name) {
        this.setName(name);
        return this;
    }
    public ZipCodesGeoZone slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public ZipCodesGeoZone status(String status) {
        this.setStatus(status);
        return this;
    }
    public ZipCodesGeoZone description(String description) {
        this.setDescription(description);
        return this;
    }
    public String getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(String zipCodes) {
        this.zipCodes = zipCodes;
    }
    
    public ZipCodesGeoZone zipCodes(String zipCodes) {
        this.setZipCodes(zipCodes);
        return this;
    }
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
    public ZipCodesGeoZone country(Country country) {
        this.setCountry(country);
        return this;
    }

}