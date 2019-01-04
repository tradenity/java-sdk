package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Option extends BaseModel{

    
    public static final String DATA_TYPE_STRING = "string";
    public static final String DATA_TYPE_NUMBER = "number";
    public static final String DATA_TYPE_DATE = "date";
    public static final String DATA_TYPE_COLOR = "color";
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    private String name;
    private String slug;
    private String description;
    private Boolean required = true;
    private String dataType = "string";
    private String status = "enable";
    private Integer position = 1;
    private Set<OptionValue> values = new LinkedHashSet<>();

    public Option(){
    }
    
    public Option id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Option name(String name) {
        this.setName(name);
        return this;
    }
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
    
    public Option slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Option description(String description) {
        this.setDescription(description);
        return this;
    }
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
    
    public Option required(Boolean required) {
        this.setRequired(required);
        return this;
    }
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    
    public Option dataType(String dataType) {
        this.setDataType(dataType);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Option status(String status) {
        this.setStatus(status);
        return this;
    }
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
    
    public Option position(Integer position) {
        this.setPosition(position);
        return this;
    }
    public Set<OptionValue> getValues() {
        if(values == null){
            this.values = new LinkedHashSet<>();
        }
        return values;
    }

    public void setValues(Set<OptionValue> values) {
        this.values = values;
    }
    
    public Option values(Set<OptionValue> values) {
        this.setValues(values);
        return this;
    }

}