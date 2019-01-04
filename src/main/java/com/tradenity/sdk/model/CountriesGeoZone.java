package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class CountriesGeoZone extends GeoZone{

    
    private Set<Country> countries = new LinkedHashSet<>();

    public CountriesGeoZone(){
    }
    
    public CountriesGeoZone id(String id) {
        this.setId(id);
        return this;
    }
    public CountriesGeoZone name(String name) {
        this.setName(name);
        return this;
    }
    public CountriesGeoZone slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public CountriesGeoZone status(String status) {
        this.setStatus(status);
        return this;
    }
    public CountriesGeoZone description(String description) {
        this.setDescription(description);
        return this;
    }
    public Set<Country> getCountries() {
        if(countries == null){
            this.countries = new LinkedHashSet<>();
        }
        return countries;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }
    
    public CountriesGeoZone countries(Set<Country> countries) {
        this.setCountries(countries);
        return this;
    }

}