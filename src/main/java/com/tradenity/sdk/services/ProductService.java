package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.ProductResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService extends AbstractService{

    ProductResource productResource;

    public ProductService(TradenityClient client) {
        super(client);
    }

    protected ProductResource getProductResource(){
        if(productResource == null) {
            productResource = resourceFactory.create(ProductResource.class);
        }
        return productResource;
    }

    public Page<Product> findAll(PageRequest pageRequest){
        Call<ResourcePage<Product>> call =  getProductResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Product> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Product>> call =  getProductResource().index(fields);
        return createPage(call);
    }

    public Product findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Product findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Product> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Product> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Product> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Product> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Product> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Product> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Product> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Product findOne(Map<String, Object> fields){
        List<Product> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Product findById(String id){
        Call<Product> call =  getProductResource().findOne(id);
        return createInstance(call);
    }

    public Product create(Product product){
        Call<Product> call =  getProductResource().save(product);
        return createInstance(call);
    }

    public Product update(Product product){
        Call<Product> call =  getProductResource().update(product.getId(), product);
        return createInstance(call);
    }

    public Product replace(Product product){
        Call<Product> call =  getProductResource().replace(product.getId(), product);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getProductResource().delete(id);
        run(call);
    }

    public void delete(Product product){
        delete(product.getId());
    }
}