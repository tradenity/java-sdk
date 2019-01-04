package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class StripeGateway extends Gateway{

    
    private String secretKey;
    private String publicKey;
    private String testSecretKey;
    private String testPublicKey;

    public StripeGateway(){
    }
    
    public StripeGateway id(String id) {
        this.setId(id);
        return this;
    }
    public StripeGateway name(String name) {
        this.setName(name);
        return this;
    }
    public StripeGateway mode(String mode) {
        this.setMode(mode);
        return this;
    }
    public StripeGateway authorizeOnly(Boolean authorizeOnly) {
        this.setAuthorizeOnly(authorizeOnly);
        return this;
    }
    public StripeGateway accountId(String accountId) {
        this.setAccountId(accountId);
        return this;
    }
    public StripeGateway status(String status) {
        this.setStatus(status);
        return this;
    }
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
    
    public StripeGateway secretKey(String secretKey) {
        this.setSecretKey(secretKey);
        return this;
    }
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    
    public StripeGateway publicKey(String publicKey) {
        this.setPublicKey(publicKey);
        return this;
    }
    public String getTestSecretKey() {
        return testSecretKey;
    }

    public void setTestSecretKey(String testSecretKey) {
        this.testSecretKey = testSecretKey;
    }
    
    public StripeGateway testSecretKey(String testSecretKey) {
        this.setTestSecretKey(testSecretKey);
        return this;
    }
    public String getTestPublicKey() {
        return testPublicKey;
    }

    public void setTestPublicKey(String testPublicKey) {
        this.testPublicKey = testPublicKey;
    }
    
    public StripeGateway testPublicKey(String testPublicKey) {
        this.setTestPublicKey(testPublicKey);
        return this;
    }

}