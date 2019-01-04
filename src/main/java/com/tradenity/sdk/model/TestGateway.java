package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class TestGateway extends Gateway{

    
    private String secretKey;
    private String publicKey;
    private String testSecretKey;
    private String testPublicKey;

    public TestGateway(){
    }
    
    public TestGateway id(String id) {
        this.setId(id);
        return this;
    }
    public TestGateway name(String name) {
        this.setName(name);
        return this;
    }
    public TestGateway mode(String mode) {
        this.setMode(mode);
        return this;
    }
    public TestGateway authorizeOnly(Boolean authorizeOnly) {
        this.setAuthorizeOnly(authorizeOnly);
        return this;
    }
    public TestGateway accountId(String accountId) {
        this.setAccountId(accountId);
        return this;
    }
    public TestGateway status(String status) {
        this.setStatus(status);
        return this;
    }
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
    
    public TestGateway secretKey(String secretKey) {
        this.setSecretKey(secretKey);
        return this;
    }
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    
    public TestGateway publicKey(String publicKey) {
        this.setPublicKey(publicKey);
        return this;
    }
    public String getTestSecretKey() {
        return testSecretKey;
    }

    public void setTestSecretKey(String testSecretKey) {
        this.testSecretKey = testSecretKey;
    }
    
    public TestGateway testSecretKey(String testSecretKey) {
        this.setTestSecretKey(testSecretKey);
        return this;
    }
    public String getTestPublicKey() {
        return testPublicKey;
    }

    public void setTestPublicKey(String testPublicKey) {
        this.testPublicKey = testPublicKey;
    }
    
    public TestGateway testPublicKey(String testPublicKey) {
        this.setTestPublicKey(testPublicKey);
        return this;
    }

}