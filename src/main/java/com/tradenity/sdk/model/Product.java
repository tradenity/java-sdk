package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Product extends BaseModel{

    
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    public static final String TYPE_DIGITAL = "digital";
    public static final String TYPE_PHYSICAL = "physical";
    public static final String AVAILABILITY_AVAILABLE = "available";
    public static final String AVAILABILITY_COMING_SOON = "comingSoon";
    public static final String AVAILABILITY_RETIRED = "retired";
    public static final String STOCK_STATUS_AVAILABLE = "available";
    public static final String STOCK_STATUS_ALERT = "alert";
    public static final String STOCK_STATUS_UNAVAILABLE = "unavailable";
    private String name;
    private String slug;
    private String model;
    private String status;
    private String type = "physical";
    private String shortDescription;
    private String fullDescription;
    private Boolean freeShipping = false;
    private String sku;
    private Integer price;
    private Integer costPrice;
    private Integer retailPrice;
    private Integer salePrice;
    private Boolean manageInventory = false;
    private Integer stockLevel = 0;
    private Integer minimumStockLevel = 0;
    private Integer maximumSellCount;
    private Boolean requireShipping = false;
    private String availability;
    private Date availabilityDate;
    private Boolean allowPreOrder = false;
    private String stockStatus;
    private Dimensions itemDimensions;
    private Dimensions packageDimensions;
    private Weight packageWeight;
    private Brand brand;
    private Photo mainPhoto;
    private Set<Photo> photos = new LinkedHashSet<>();
    private Set<StorageFile> files = new LinkedHashSet<>();
    private Set<Promotion> promotions = new LinkedHashSet<>();
    private Set<Product> relatedProducts = new LinkedHashSet<>();
    private Set<Category> categories = new LinkedHashSet<>();
    private TaxClass taxClass;
    private OptionSet optionSet;
    private Set<Variant> variants = new LinkedHashSet<>();

    public Product(){
    }
    
    public Product id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Product name(String name) {
        this.setName(name);
        return this;
    }
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
    
    public Product slug(String slug) {
        this.setSlug(slug);
        return this;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public Product model(String model) {
        this.setModel(model);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Product status(String status) {
        this.setStatus(status);
        return this;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Product type(String type) {
        this.setType(type);
        return this;
    }
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    
    public Product shortDescription(String shortDescription) {
        this.setShortDescription(shortDescription);
        return this;
    }
    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }
    
    public Product fullDescription(String fullDescription) {
        this.setFullDescription(fullDescription);
        return this;
    }
    public Boolean getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Boolean freeShipping) {
        this.freeShipping = freeShipping;
    }
    
    public Product freeShipping(Boolean freeShipping) {
        this.setFreeShipping(freeShipping);
        return this;
    }
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
    
    public Product sku(String sku) {
        this.setSku(sku);
        return this;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    
    public Product price(Integer price) {
        this.setPrice(price);
        return this;
    }
    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }
    
    public Product costPrice(Integer costPrice) {
        this.setCostPrice(costPrice);
        return this;
    }
    public Integer getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Integer retailPrice) {
        this.retailPrice = retailPrice;
    }
    
    public Product retailPrice(Integer retailPrice) {
        this.setRetailPrice(retailPrice);
        return this;
    }
    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }
    
    public Product salePrice(Integer salePrice) {
        this.setSalePrice(salePrice);
        return this;
    }
    public Boolean getManageInventory() {
        return manageInventory;
    }

    public void setManageInventory(Boolean manageInventory) {
        this.manageInventory = manageInventory;
    }
    
    public Product manageInventory(Boolean manageInventory) {
        this.setManageInventory(manageInventory);
        return this;
    }
    public Integer getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Integer stockLevel) {
        this.stockLevel = stockLevel;
    }
    
    public Product stockLevel(Integer stockLevel) {
        this.setStockLevel(stockLevel);
        return this;
    }
    public Integer getMinimumStockLevel() {
        return minimumStockLevel;
    }

    public void setMinimumStockLevel(Integer minimumStockLevel) {
        this.minimumStockLevel = minimumStockLevel;
    }
    
    public Product minimumStockLevel(Integer minimumStockLevel) {
        this.setMinimumStockLevel(minimumStockLevel);
        return this;
    }
    public Integer getMaximumSellCount() {
        return maximumSellCount;
    }

    public void setMaximumSellCount(Integer maximumSellCount) {
        this.maximumSellCount = maximumSellCount;
    }
    
    public Product maximumSellCount(Integer maximumSellCount) {
        this.setMaximumSellCount(maximumSellCount);
        return this;
    }
    public Boolean getRequireShipping() {
        return requireShipping;
    }

    public void setRequireShipping(Boolean requireShipping) {
        this.requireShipping = requireShipping;
    }
    
    public Product requireShipping(Boolean requireShipping) {
        this.setRequireShipping(requireShipping);
        return this;
    }
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
    
    public Product availability(String availability) {
        this.setAvailability(availability);
        return this;
    }
    public Date getAvailabilityDate() {
        return availabilityDate;
    }

    public void setAvailabilityDate(Date availabilityDate) {
        this.availabilityDate = availabilityDate;
    }
    
    public Product availabilityDate(Date availabilityDate) {
        this.setAvailabilityDate(availabilityDate);
        return this;
    }
    public Boolean getAllowPreOrder() {
        return allowPreOrder;
    }

    public void setAllowPreOrder(Boolean allowPreOrder) {
        this.allowPreOrder = allowPreOrder;
    }
    
    public Product allowPreOrder(Boolean allowPreOrder) {
        this.setAllowPreOrder(allowPreOrder);
        return this;
    }
    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }
    
    public Product stockStatus(String stockStatus) {
        this.setStockStatus(stockStatus);
        return this;
    }
    public Dimensions getItemDimensions() {
        return itemDimensions;
    }

    public void setItemDimensions(Dimensions itemDimensions) {
        this.itemDimensions = itemDimensions;
    }
    
    public Product itemDimensions(Dimensions itemDimensions) {
        this.setItemDimensions(itemDimensions);
        return this;
    }
    public Dimensions getPackageDimensions() {
        return packageDimensions;
    }

    public void setPackageDimensions(Dimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }
    
    public Product packageDimensions(Dimensions packageDimensions) {
        this.setPackageDimensions(packageDimensions);
        return this;
    }
    public Weight getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(Weight packageWeight) {
        this.packageWeight = packageWeight;
    }
    
    public Product packageWeight(Weight packageWeight) {
        this.setPackageWeight(packageWeight);
        return this;
    }
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    
    public Product brand(Brand brand) {
        this.setBrand(brand);
        return this;
    }
    public Photo getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(Photo mainPhoto) {
        this.mainPhoto = mainPhoto;
    }
    
    public Product mainPhoto(Photo mainPhoto) {
        this.setMainPhoto(mainPhoto);
        return this;
    }
    public Set<Photo> getPhotos() {
        if(photos == null){
            this.photos = new LinkedHashSet<>();
        }
        return photos;
    }

    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }
    
    public Product photos(Set<Photo> photos) {
        this.setPhotos(photos);
        return this;
    }
    public Set<StorageFile> getFiles() {
        if(files == null){
            this.files = new LinkedHashSet<>();
        }
        return files;
    }

    public void setFiles(Set<StorageFile> files) {
        this.files = files;
    }
    
    public Product files(Set<StorageFile> files) {
        this.setFiles(files);
        return this;
    }
    public Set<Promotion> getPromotions() {
        if(promotions == null){
            this.promotions = new LinkedHashSet<>();
        }
        return promotions;
    }

    public void setPromotions(Set<Promotion> promotions) {
        this.promotions = promotions;
    }
    
    public Product promotions(Set<Promotion> promotions) {
        this.setPromotions(promotions);
        return this;
    }
    public Set<Product> getRelatedProducts() {
        if(relatedProducts == null){
            this.relatedProducts = new LinkedHashSet<>();
        }
        return relatedProducts;
    }

    public void setRelatedProducts(Set<Product> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }
    
    public Product relatedProducts(Set<Product> relatedProducts) {
        this.setRelatedProducts(relatedProducts);
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
    
    public Product categories(Set<Category> categories) {
        this.setCategories(categories);
        return this;
    }
    public TaxClass getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(TaxClass taxClass) {
        this.taxClass = taxClass;
    }
    
    public Product taxClass(TaxClass taxClass) {
        this.setTaxClass(taxClass);
        return this;
    }
    public OptionSet getOptionSet() {
        return optionSet;
    }

    public void setOptionSet(OptionSet optionSet) {
        this.optionSet = optionSet;
    }
    
    public Product optionSet(OptionSet optionSet) {
        this.setOptionSet(optionSet);
        return this;
    }
    public Set<Variant> getVariants() {
        if(variants == null){
            this.variants = new LinkedHashSet<>();
        }
        return variants;
    }

    public void setVariants(Set<Variant> variants) {
        this.variants = variants;
    }
    
    public Product variants(Set<Variant> variants) {
        this.setVariants(variants);
        return this;
    }

}