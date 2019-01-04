package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CountryResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryService extends AbstractService{

    CountryResource countryResource;

    public CountryService(TradenityClient client) {
        super(client);
    }

    protected CountryResource getCountryResource(){
        if(countryResource == null) {
            countryResource = resourceFactory.create(CountryResource.class);
        }
        return countryResource;
    }

    public Page<Country> findAll(PageRequest pageRequest){
        Call<ResourcePage<Country>> call =  getCountryResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Country> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Country>> call =  getCountryResource().index(fields);
        return createPage(call);
    }

    public Country findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Country findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Country> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Country> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Country> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Country> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Country> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Country> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Country> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Country findOne(Map<String, Object> fields){
        List<Country> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Country findById(String id){
        Call<Country> call =  getCountryResource().findOne(id);
        return createInstance(call);
    }

    public Country create(Country country){
        Call<Country> call =  getCountryResource().save(country);
        return createInstance(call);
    }

    public Country update(Country country){
        Call<Country> call =  getCountryResource().update(country.getId(), country);
        return createInstance(call);
    }

    public Country replace(Country country){
        Call<Country> call =  getCountryResource().replace(country.getId(), country);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getCountryResource().delete(id);
        run(call);
    }

    public void delete(Country country){
        delete(country.getId());
    }
}