package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class State extends BaseModel{

    
    private String name;
    private String code;
    private Country country;

    public State(){
    }
    
    public State id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public State name(String name) {
        this.setName(name);
        return this;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public State code(String code) {
        this.setCode(code);
        return this;
    }
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
    public State country(Country country) {
        this.setCountry(country);
        return this;
    }

}