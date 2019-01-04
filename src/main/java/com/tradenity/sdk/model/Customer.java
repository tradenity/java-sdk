package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Customer extends BaseModel{

    
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String status = "disabled";
    private Photo photo;
    private Address billingAddress;
    private Address shippingAddress;
    private Set<CustomerGroup> customerGroups = new LinkedHashSet<>();

    public Customer(){
    }
    
    public Customer id(String id) {
        this.setId(id);
        return this;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public Customer firstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Customer lastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Customer email(String email) {
        this.setEmail(email);
        return this;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public Customer username(String username) {
        this.setUsername(username);
        return this;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Customer password(String password) {
        this.setPassword(password);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Customer status(String status) {
        this.setStatus(status);
        return this;
    }
    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
    
    public Customer photo(Photo photo) {
        this.setPhoto(photo);
        return this;
    }
    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
    
    public Customer billingAddress(Address billingAddress) {
        this.setBillingAddress(billingAddress);
        return this;
    }
    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    
    public Customer shippingAddress(Address shippingAddress) {
        this.setShippingAddress(shippingAddress);
        return this;
    }
    public Set<CustomerGroup> getCustomerGroups() {
        if(customerGroups == null){
            this.customerGroups = new LinkedHashSet<>();
        }
        return customerGroups;
    }

    public void setCustomerGroups(Set<CustomerGroup> customerGroups) {
        this.customerGroups = customerGroups;
    }
    
    public Customer customerGroups(Set<CustomerGroup> customerGroups) {
        this.setCustomerGroups(customerGroups);
        return this;
    }

}