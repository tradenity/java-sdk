package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.Brand;
import com.tradenity.sdk.model.Page;
import com.tradenity.sdk.model.PageRequest;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.BrandResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:06 PM
 */
public class BrandService extends AbstractService{

    BrandResource brandResource;

    public BrandService(TradenityClient client) {
        super(client, "brands");
    }

    protected BrandResource getBrandResource(){
        if(brandResource == null) {
            brandResource = resourceFactory.create(BrandResource.class);
        }
        return brandResource;
    }

    public Page<Brand> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Brand> findAll(PageRequest pageRequest){
        Call<ResourcePage<Brand>> call =  getBrandResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Brand> search(Brand brand){
        return search(brand, new PageRequest());
    }

    public Page<Brand> search(Brand brand, PageRequest pageRequest){
        return search(notNullMap(toMap(brand)), pageRequest);
    }

    public Page<Brand> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Page<Brand> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Brand>> call =  getBrandResource().index(fields);
        return createPage(call);
    }

    public Brand findOne(Map<String, Object> fields){
        List<Brand> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Brand findByName(String name){
        return findOne(Collections.<String, Object>singletonMap("name", name));
    }

    public Brand findById(String id){
        Call<Brand> call =  getBrandResource().findOne(id);
        return createInstance(call);
    }

    public Brand create(Brand brand){
        Call<Brand> call =  getBrandResource().save(toMap(brand));
        return createInstance(call);
    }

    public Brand update(Brand brand){
        Call<Brand> call =  getBrandResource().update(brand.getId(), toMap(brand));
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getBrandResource().delete(id);
        run(call);
    }

    public void delete(Brand brand){
        delete(brand.getId());
    }

    private Map<String, Object> toMap(Brand brand) {
        Map<String, Object> m = new HashMap<>();
        m.put("name", brand.getName());
        m.put("title", brand.getTitle());
        m.put("status", brand.getStatus());
        m.put("description", brand.getDescription());
        return m;
    }
}
