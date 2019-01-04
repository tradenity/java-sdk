package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Gateway extends BaseModel{

    
    public static final String MODE_TEST = "test";
    public static final String MODE_LIVE = "live";
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    private String name;
    private String mode;
    private Boolean authorizeOnly = false;
    private String accountId;
    private String status;

    public Gateway(){
    }
    
    public Gateway id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Gateway name(String name) {
        this.setName(name);
        return this;
    }
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
    
    public Gateway mode(String mode) {
        this.setMode(mode);
        return this;
    }
    public Boolean getAuthorizeOnly() {
        return authorizeOnly;
    }

    public void setAuthorizeOnly(Boolean authorizeOnly) {
        this.authorizeOnly = authorizeOnly;
    }
    
    public Gateway authorizeOnly(Boolean authorizeOnly) {
        this.setAuthorizeOnly(authorizeOnly);
        return this;
    }
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    public Gateway accountId(String accountId) {
        this.setAccountId(accountId);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Gateway status(String status) {
        this.setStatus(status);
        return this;
    }

}