package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class StoreProfile extends BaseModel{

    
    private String name;
    private String description;
    private String facebook;
    private String twitter;
    private String youtube;
    private String instagram;
    private String pinterest;
    private String linkedin;
    private ContactInfo contactInfo;
    private ContactInfo billingInfo;

    public StoreProfile(){
    }
    
    public StoreProfile id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public StoreProfile name(String name) {
        this.setName(name);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public StoreProfile description(String description) {
        this.setDescription(description);
        return this;
    }
    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    
    public StoreProfile facebook(String facebook) {
        this.setFacebook(facebook);
        return this;
    }
    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
    
    public StoreProfile twitter(String twitter) {
        this.setTwitter(twitter);
        return this;
    }
    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }
    
    public StoreProfile youtube(String youtube) {
        this.setYoutube(youtube);
        return this;
    }
    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
    
    public StoreProfile instagram(String instagram) {
        this.setInstagram(instagram);
        return this;
    }
    public String getPinterest() {
        return pinterest;
    }

    public void setPinterest(String pinterest) {
        this.pinterest = pinterest;
    }
    
    public StoreProfile pinterest(String pinterest) {
        this.setPinterest(pinterest);
        return this;
    }
    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
    
    public StoreProfile linkedin(String linkedin) {
        this.setLinkedin(linkedin);
        return this;
    }
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
    
    public StoreProfile contactInfo(ContactInfo contactInfo) {
        this.setContactInfo(contactInfo);
        return this;
    }
    public ContactInfo getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(ContactInfo billingInfo) {
        this.billingInfo = billingInfo;
    }
    
    public StoreProfile billingInfo(ContactInfo billingInfo) {
        this.setBillingInfo(billingInfo);
        return this;
    }

}