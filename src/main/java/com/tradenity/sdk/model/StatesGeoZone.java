package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class StatesGeoZone extends GeoZone{

    
    private Set<State> states = new LinkedHashSet<>();
    private Country country;

    public StatesGeoZone(){
    }
    
    public StatesGeoZone id(String id) {
        this.setId(id);
        return this;
    }
    public StatesGeoZone name(String name) {
        this.setName(name);
        return this;
    }
    public StatesGeoZone slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public StatesGeoZone status(String status) {
        this.setStatus(status);
        return this;
    }
    public StatesGeoZone description(String description) {
        this.setDescription(description);
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
    
    public StatesGeoZone states(Set<State> states) {
        this.setStates(states);
        return this;
    }
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
    public StatesGeoZone country(Country country) {
        this.setCountry(country);
        return this;
    }

}