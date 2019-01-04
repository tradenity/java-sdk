package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class ContactInfo {

    
    private String contactName;
    private String email;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public ContactInfo(){
    }
    
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    
    public ContactInfo contactName(String contactName) {
        this.setContactName(contactName);
        return this;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public ContactInfo email(String email) {
        this.setEmail(email);
        return this;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public ContactInfo phone(String phone) {
        this.setPhone(phone);
        return this;
    }
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    
    public ContactInfo addressLine1(String addressLine1) {
        this.setAddressLine1(addressLine1);
        return this;
    }
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    
    public ContactInfo addressLine2(String addressLine2) {
        this.setAddressLine2(addressLine2);
        return this;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public ContactInfo city(String city) {
        this.setCity(city);
        return this;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public ContactInfo state(String state) {
        this.setState(state);
        return this;
    }
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public ContactInfo zipCode(String zipCode) {
        this.setZipCode(zipCode);
        return this;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public ContactInfo country(String country) {
        this.setCountry(country);
        return this;
    }

}