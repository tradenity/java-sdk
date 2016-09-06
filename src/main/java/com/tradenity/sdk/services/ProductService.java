package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ProductResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:06 PM
 */
public class ProductService extends AbstractService{
    ProductResource productResource;
    public ProductService(TradenityClient client) {
        super(client, "products");
    }

    protected ProductResource getProductResource(){
        if(productResource == null) {
            productResource = resourceFactory.create(ProductResource.class);
        }
        return productResource;
    }

    public Page<Product> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Product> findAll(PageRequest pageRequest){
        Call<ResourcePage<Product>> call =  getProductResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Product> search(Product product){
        return search(product, new PageRequest());
    }

    public Page<Product> search(Product product, PageRequest pageRequest){
        return search(primitiveMap(product), pageRequest);
    }

    public Page<Product> search(String fieldName, String value){
        return search(fieldName, value, new PageRequest());
    }

    public Page<Product> search(String fieldName, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(fieldName, value), pageRequest);
    }

    public Page<Product> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Page<Product> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }
        Call<ResourcePage<Product>> call =  getProductResource().index(fields);
        return createPage(call);
    }

    public Page<Product> findAllByBrand(Brand brand) {
        return search(Collections.<String, Object>singletonMap("brand", brand.getId()));
    }

    public Page<Product> findAllByCategory(Category category) {
        return search(Collections.<String, Object>singletonMap("category", category.getId()));
    }
    public Product findById(String id){
        Call<Product> call =  getProductResource().findById(id);
        return createInstance(call);
    }

    public Product create(Product product){
        Call<Product> call = getProductResource().save(toMap(product));
        return createInstance(call);
    }

    public Product update(Product product){
        Call<Product> call = getProductResource().update(product.getId(), notNullMap(toMap(product)));
        return createInstance(call);
    }

    public boolean delete(String id){
        Call<Void> call = getProductResource().delete(id);
        return isSuccessful(call);
    }

    public boolean delete(Product product){
        return delete(product.getId());
    }

    private Map<String, Object> toMap(Product product) {
        Map<String, Object> m = primitiveMap(product);
        m.putAll(withPrefix("itemWeight.", product.getItemWeight().toMap()));
        m.putAll(withPrefix("packageWeight.", product.getPackageWeight().toMap()));
        m.putAll(withPrefix("itemDimensions.", product.getItemDimensions().toMap()));
        m.putAll(withPrefix("packageDimensions.", product.getPackageDimensions().toMap()));
        return m;
    }

    private Map<String, Object> primitiveMap(Product product) {
        Map<String, Object> m = new HashMap<>();
        m.put("name", product.getName());
        m.put("title", product.getTitle());
        m.put("status", product.getStatus());
        m.put("description", product.getDescription());
        m.put("fullDescription", product.getFullDescription());
        m.put("shortDescription", product.getShortDescription());
        m.put("specifications", product.getSpecifications());
        m.put("sku", product.getSku());
        m.put("price", product.getPrice());
        m.put("stockLevel", product.getStockLevel());
        m.put("minimumStockLevel", product.getMinimumStockLevel());
        m.put("hasStockLimit", product.isHasSellLimit());
        m.put("maximumSellCount", product.getMaximumSellCount());
        m.put("stockStatus", product.getStockStatus());
        m.put("catalogOnly", product.getCatalogOnly());
        return m;
    }

}
