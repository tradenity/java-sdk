package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Variant extends BaseModel{

    
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    private String name;
    private String slug;
    private String sku;
    private String description;
    private String status;
    private Integer priceChange;
    private Integer stockLevel;
    private Integer minimumStockLevel;
    private Integer maximumSellCount;
    private Dimensions itemDimensions;
    private Dimensions packageDimensions;
    private Weight packageWeight;
    private Product product;
    private OptionSet optionSet;
    private Set<OptionValue> optionValues = new LinkedHashSet<>();

    public Variant(){
    }
    
    public Variant id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Variant name(String name) {
        this.setName(name);
        return this;
    }
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
    
    public Variant slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
    
    public Variant sku(String sku) {
        this.setSku(sku);
        return this;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Variant description(String description) {
        this.setDescription(description);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Variant status(String status) {
        this.setStatus(status);
        return this;
    }
    public Integer getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(Integer priceChange) {
        this.priceChange = priceChange;
    }
    
    public Variant priceChange(Integer priceChange) {
        this.setPriceChange(priceChange);
        return this;
    }
    public Integer getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Integer stockLevel) {
        this.stockLevel = stockLevel;
    }
    
    public Variant stockLevel(Integer stockLevel) {
        this.setStockLevel(stockLevel);
        return this;
    }
    public Integer getMinimumStockLevel() {
        return minimumStockLevel;
    }

    public void setMinimumStockLevel(Integer minimumStockLevel) {
        this.minimumStockLevel = minimumStockLevel;
    }
    
    public Variant minimumStockLevel(Integer minimumStockLevel) {
        this.setMinimumStockLevel(minimumStockLevel);
        return this;
    }
    public Integer getMaximumSellCount() {
        return maximumSellCount;
    }

    public void setMaximumSellCount(Integer maximumSellCount) {
        this.maximumSellCount = maximumSellCount;
    }
    
    public Variant maximumSellCount(Integer maximumSellCount) {
        this.setMaximumSellCount(maximumSellCount);
        return this;
    }
    public Dimensions getItemDimensions() {
        return itemDimensions;
    }

    public void setItemDimensions(Dimensions itemDimensions) {
        this.itemDimensions = itemDimensions;
    }
    
    public Variant itemDimensions(Dimensions itemDimensions) {
        this.setItemDimensions(itemDimensions);
        return this;
    }
    public Dimensions getPackageDimensions() {
        return packageDimensions;
    }

    public void setPackageDimensions(Dimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }
    
    public Variant packageDimensions(Dimensions packageDimensions) {
        this.setPackageDimensions(packageDimensions);
        return this;
    }
    public Weight getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(Weight packageWeight) {
        this.packageWeight = packageWeight;
    }
    
    public Variant packageWeight(Weight packageWeight) {
        this.setPackageWeight(packageWeight);
        return this;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public Variant product(Product product) {
        this.setProduct(product);
        return this;
    }
    public OptionSet getOptionSet() {
        return optionSet;
    }

    public void setOptionSet(OptionSet optionSet) {
        this.optionSet = optionSet;
    }
    
    public Variant optionSet(OptionSet optionSet) {
        this.setOptionSet(optionSet);
        return this;
    }
    public Set<OptionValue> getOptionValues() {
        if(optionValues == null){
            this.optionValues = new LinkedHashSet<>();
        }
        return optionValues;
    }

    public void setOptionValues(Set<OptionValue> optionValues) {
        this.optionValues = optionValues;
    }
    
    public Variant optionValues(Set<OptionValue> optionValues) {
        this.setOptionValues(optionValues);
        return this;
    }

}