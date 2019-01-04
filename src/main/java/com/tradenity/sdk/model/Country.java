package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Country extends BaseModel{

    
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    private String name;
    private String iso2;
    private String iso3;
    private String iso3166;
    private String countryCode;
    private String subRegion;
    private String region;
    private String status;
    private Set<State> states = new LinkedHashSet<>();

    public Country(){
    }
    
    public Country id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Country name(String name) {
        this.setName(name);
        return this;
    }
    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }
    
    public Country iso2(String iso2) {
        this.setIso2(iso2);
        return this;
    }
    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }
    
    public Country iso3(String iso3) {
        this.setIso3(iso3);
        return this;
    }
    public String getIso3166() {
        return iso3166;
    }

    public void setIso3166(String iso3166) {
        this.iso3166 = iso3166;
    }
    
    public Country iso3166(String iso3166) {
        this.setIso3166(iso3166);
        return this;
    }
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    public Country countryCode(String countryCode) {
        this.setCountryCode(countryCode);
        return this;
    }
    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }
    
    public Country subRegion(String subRegion) {
        this.setSubRegion(subRegion);
        return this;
    }
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public Country region(String region) {
        this.setRegion(region);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Country status(String status) {
        this.setStatus(status);
        return this;
    }
    public Set<State> getStates() {
        if(states == null){
            this.states = new LinkedHashSet<>();
        }
        return states;
    }

    public void setStates(Set<State> states) {
        this.states = states;
    }
    
    public Country states(Set<State> states) {
        this.setStates(states);
        return this;
    }

}