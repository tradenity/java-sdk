package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class ApiCredentialsSet extends BaseModel{

    
    private String name;
    private String description;
    private String publicKey;
    private String secretKey;

    public ApiCredentialsSet(){
    }
    
    public ApiCredentialsSet id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public ApiCredentialsSet name(String name) {
        this.setName(name);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public ApiCredentialsSet description(String description) {
        this.setDescription(description);
        return this;
    }
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    
    public ApiCredentialsSet publicKey(String publicKey) {
        this.setPublicKey(publicKey);
        return this;
    }
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
    
    public ApiCredentialsSet secretKey(String secretKey) {
        this.setSecretKey(secretKey);
        return this;
    }

}