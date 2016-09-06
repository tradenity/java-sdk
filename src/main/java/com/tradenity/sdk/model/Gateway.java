package com.tradenity.sdk.model;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 1:15 PM
 */
public class Gateway extends BaseModel{
    String name;
    String title;
    String status;
    String mode;
    String accountId;
    String description;
    String secretKey;
    String publicKey;
    String testSecretKey;
    String testPublicKey;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getTestSecretKey() {
        return testSecretKey;
    }

    public void setTestSecretKey(String testSecretKey) {
        this.testSecretKey = testSecretKey;
    }

    public String getTestPublicKey() {
        return testPublicKey;
    }

    public void setTestPublicKey(String testPublicKey) {
        this.testPublicKey = testPublicKey;
    }

}
