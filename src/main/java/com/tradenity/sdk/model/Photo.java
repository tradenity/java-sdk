package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Photo extends BaseModel{

    
    private String name;
    private String title;
    private String description;
    private Integer position;
    private String mimeType;
    private String storageType;
    private String storagePath;
    private String url;

    public Photo(){
    }
    
    public Photo id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Photo name(String name) {
        this.setName(name);
        return this;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public Photo title(String title) {
        this.setTitle(title);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Photo description(String description) {
        this.setDescription(description);
        return this;
    }
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
    
    public Photo position(Integer position) {
        this.setPosition(position);
        return this;
    }
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
    
    public Photo mimeType(String mimeType) {
        this.setMimeType(mimeType);
        return this;
    }
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }
    
    public Photo storageType(String storageType) {
        this.setStorageType(storageType);
        return this;
    }
    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }
    
    public Photo storagePath(String storagePath) {
        this.setStoragePath(storagePath);
        return this;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public Photo url(String url) {
        this.setUrl(url);
        return this;
    }

}