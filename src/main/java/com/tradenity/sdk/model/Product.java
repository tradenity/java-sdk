package com.tradenity.sdk.model;

import java.util.List;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 1:15 PM
 */
public class Product extends BaseModel{
    String name;
    String title;
    String status;
    String description;
    String fullDescription;
    String shortDescription;
    String specifications;
    String sku;
    Float price;
    Long stockLevel;
    Long minimumStockLevel;
    boolean hasSellLimit;
    Long maximumSellCount;
    String stockStatus;
    Boolean catalogOnly;
    Weight itemWeight;
    Weight packageWeight;
    Dimensions itemDimensions;
    Dimensions packageDimensions;
    Boolean requireShipping;
    Photo mainPhoto;
    List<Photo> photos;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Long stockLevel) {
        this.stockLevel = stockLevel;
    }

    public Long getMinimumStockLevel() {
        return minimumStockLevel;
    }

    public void setMinimumStockLevel(Long minimumStockLevel) {
        this.minimumStockLevel = minimumStockLevel;
    }

    public boolean isHasSellLimit() {
        return hasSellLimit;
    }

    public void setHasSellLimit(boolean hasSellLimit) {
        this.hasSellLimit = hasSellLimit;
    }

    public Long getMaximumSellCount() {
        return maximumSellCount;
    }

    public void setMaximumSellCount(Long maximumSellCount) {
        this.maximumSellCount = maximumSellCount;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public Boolean getCatalogOnly() {
        return catalogOnly;
    }

    public void setCatalogOnly(Boolean catalogOnly) {
        this.catalogOnly = catalogOnly;
    }

    public Weight getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Weight itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Weight getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(Weight packageWeight) {
        this.packageWeight = packageWeight;
    }

    public Dimensions getItemDimensions() {
        return itemDimensions;
    }

    public void setItemDimensions(Dimensions itemDimensions) {
        this.itemDimensions = itemDimensions;
    }

    public Dimensions getPackageDimensions() {
        return packageDimensions;
    }

    public void setPackageDimensions(Dimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    public Boolean getRequireShipping() {
        return requireShipping;
    }

    public void setRequireShipping(Boolean requireShipping) {
        this.requireShipping = requireShipping;
    }

    public Photo getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(Photo mainPhoto) {
        this.mainPhoto = mainPhoto;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

}
