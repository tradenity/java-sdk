package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class StorageFile extends BaseModel{

    
    private String name;
    private String title;
    private String specifier;
    private String mimeType;
    private String description;
    private String storageType;
    private String storagePath;
    private String url;

    public StorageFile(){
    }
    
    public StorageFile id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public StorageFile name(String name) {
        this.setName(name);
        return this;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public StorageFile title(String title) {
        this.setTitle(title);
        return this;
    }
    public String getSpecifier() {
        return specifier;
    }

    public void setSpecifier(String specifier) {
        this.specifier = specifier;
    }
    
    public StorageFile specifier(String specifier) {
        this.setSpecifier(specifier);
        return this;
    }
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
    
    public StorageFile mimeType(String mimeType) {
        this.setMimeType(mimeType);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public StorageFile description(String description) {
        this.setDescription(description);
        return this;
    }
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }
    
    public StorageFile storageType(String storageType) {
        this.setStorageType(storageType);
        return this;
    }
    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }
    
    public StorageFile storagePath(String storagePath) {
        this.setStoragePath(storagePath);
        return this;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public StorageFile url(String url) {
        this.setUrl(url);
        return this;
    }

}