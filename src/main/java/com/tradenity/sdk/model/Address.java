package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Address extends BaseModel{

    
    private String streetLine1;
    private String streetLine2;
    private String city;
    private String zipCode;
    private State state;
    private Country country;

    public Address(){
    }
    
    public Address id(String id) {
        this.setId(id);
        return this;
    }
    public String getStreetLine1() {
        return streetLine1;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }
    
    public Address streetLine1(String streetLine1) {
        this.setStreetLine1(streetLine1);
        return this;
    }
    public String getStreetLine2() {
        return streetLine2;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }
    
    public Address streetLine2(String streetLine2) {
        this.setStreetLine2(streetLine2);
        return this;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public Address city(String city) {
        this.setCity(city);
        return this;
    }
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public Address zipCode(String zipCode) {
        this.setZipCode(zipCode);
        return this;
    }
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public Address state(State state) {
        this.setState(state);
        return this;
    }
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
    public Address country(Country country) {
        this.setCountry(country);
        return this;
    }

}