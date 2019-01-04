package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class WishList extends BaseModel{

    
    private String name;
    private String description;
    private Set<Product> products = new LinkedHashSet<>();
    private Customer customer;

    public WishList(){
    }
    
    public WishList id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public WishList name(String name) {
        this.setName(name);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public WishList description(String description) {
        this.setDescription(description);
        return this;
    }
    public Set<Product> getProducts() {
        if(products == null){
            this.products = new LinkedHashSet<>();
        }
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
    
    public WishList products(Set<Product> products) {
        this.setProducts(products);
        return this;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public WishList customer(Customer customer) {
        this.setCustomer(customer);
        return this;
    }

}