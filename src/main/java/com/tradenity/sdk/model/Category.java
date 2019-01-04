package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Category extends BaseModel{

    
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    private String name;
    private String slug;
    private String status;
    private String description;
    private Integer depth = 0;
    private Integer position = 0;
    private Photo photo;
    private Category parentCategory;

    public Category(){
    }
    
    public Category id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Category name(String name) {
        this.setName(name);
        return this;
    }
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
    
    public Category slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Category status(String status) {
        this.setStatus(status);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Category description(String description) {
        this.setDescription(description);
        return this;
    }
    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }
    
    public Category depth(Integer depth) {
        this.setDepth(depth);
        return this;
    }
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
    
    public Category position(Integer position) {
        this.setPosition(position);
        return this;
    }
    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
    
    public Category photo(Photo photo) {
        this.setPhoto(photo);
        return this;
    }
    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }
    
    public Category parentCategory(Category parentCategory) {
        this.setParentCategory(parentCategory);
        return this;
    }

}