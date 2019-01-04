package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class OptionSet extends BaseModel{

    
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    private String name;
    private String slug;
    private String description;
    private String status = "enabled";
    private Set<Option> options = new LinkedHashSet<>();

    public OptionSet(){
    }
    
    public OptionSet id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public OptionSet name(String name) {
        this.setName(name);
        return this;
    }
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
    
    public OptionSet slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public OptionSet description(String description) {
        this.setDescription(description);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public OptionSet status(String status) {
        this.setStatus(status);
        return this;
    }
    public Set<Option> getOptions() {
        if(options == null){
            this.options = new LinkedHashSet<>();
        }
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }
    
    public OptionSet options(Set<Option> options) {
        this.setOptions(options);
        return this;
    }

}