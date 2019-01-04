package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Promotion extends BaseModel{

    
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    private String name;
    private String description;
    private String status;
    private Date beginsAt;
    private Date endsAt;
    private ItemsSelector include;

    public Promotion(){
    }
    
    public Promotion id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Promotion name(String name) {
        this.setName(name);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Promotion description(String description) {
        this.setDescription(description);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Promotion status(String status) {
        this.setStatus(status);
        return this;
    }
    public Date getBeginsAt() {
        return beginsAt;
    }

    public void setBeginsAt(Date beginsAt) {
        this.beginsAt = beginsAt;
    }
    
    public Promotion beginsAt(Date beginsAt) {
        this.setBeginsAt(beginsAt);
        return this;
    }
    public Date getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Date endsAt) {
        this.endsAt = endsAt;
    }
    
    public Promotion endsAt(Date endsAt) {
        this.setEndsAt(endsAt);
        return this;
    }
    public ItemsSelector getInclude() {
        return include;
    }

    public void setInclude(ItemsSelector include) {
        this.include = include;
    }
    
    public Promotion include(ItemsSelector include) {
        this.setInclude(include);
        return this;
    }

}