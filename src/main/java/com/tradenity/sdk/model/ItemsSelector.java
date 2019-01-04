package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class ItemsSelector extends BaseModel{

    
    private Set<Category> categories = new LinkedHashSet<>();
    private Set<Brand> brands = new LinkedHashSet<>();
    private Set<Collection> collections = new LinkedHashSet<>();
    private Set<Product> products = new LinkedHashSet<>();

    public ItemsSelector(){
    }
    
    public ItemsSelector id(String id) {
        this.setId(id);
        return this;
    }
    public Set<Category> getCategories() {
        if(categories == null){
            this.categories = new LinkedHashSet<>();
        }
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
    
    public ItemsSelector categories(Set<Category> categories) {
        this.setCategories(categories);
        return this;
    }
    public Set<Brand> getBrands() {
        if(brands == null){
            this.brands = new LinkedHashSet<>();
        }
        return brands;
    }

    public void setBrands(Set<Brand> brands) {
        this.brands = brands;
    }
    
    public ItemsSelector brands(Set<Brand> brands) {
        this.setBrands(brands);
        return this;
    }
    public Set<Collection> getCollections() {
        if(collections == null){
            this.collections = new LinkedHashSet<>();
        }
        return collections;
    }

    public void setCollections(Set<Collection> collections) {
        this.collections = collections;
    }
    
    public ItemsSelector collections(Set<Collection> collections) {
        this.setCollections(collections);
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
    
    public ItemsSelector products(Set<Product> products) {
        this.setProducts(products);
        return this;
    }

}