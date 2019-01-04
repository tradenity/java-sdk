package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class BraintreeGateway extends Gateway{

    
    private String secretKey;
    private String publicKey;
    private String testSecretKey;
    private String testPublicKey;

    public BraintreeGateway(){
    }
    
    public BraintreeGateway id(String id) {
        this.setId(id);
        return this;
    }
    public BraintreeGateway name(String name) {
        this.setName(name);
        return this;
    }
    public BraintreeGateway mode(String mode) {
        this.setMode(mode);
        return this;
    }
    public BraintreeGateway authorizeOnly(Boolean authorizeOnly) {
        this.setAuthorizeOnly(authorizeOnly);
        return this;
    }
    public BraintreeGateway accountId(String accountId) {
        this.setAccountId(accountId);
        return this;
    }
    public BraintreeGateway status(String status) {
        this.setStatus(status);
        return this;
    }
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
    
    public BraintreeGateway secretKey(String secretKey) {
        this.setSecretKey(secretKey);
        return this;
    }
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    
    public BraintreeGateway publicKey(String publicKey) {
        this.setPublicKey(publicKey);
        return this;
    }
    public String getTestSecretKey() {
        return testSecretKey;
    }

    public void setTestSecretKey(String testSecretKey) {
        this.testSecretKey = testSecretKey;
    }
    
    public BraintreeGateway testSecretKey(String testSecretKey) {
        this.setTestSecretKey(testSecretKey);
        return this;
    }
    public String getTestPublicKey() {
        return testPublicKey;
    }

    public void setTestPublicKey(String testPublicKey) {
        this.testPublicKey = testPublicKey;
    }
    
    public BraintreeGateway testPublicKey(String testPublicKey) {
        this.setTestPublicKey(testPublicKey);
        return this;
    }

}