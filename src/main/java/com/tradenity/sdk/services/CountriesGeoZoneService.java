package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CountriesGeoZoneResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountriesGeoZoneService extends AbstractService{

    CountriesGeoZoneResource countriesGeoZoneResource;

    public CountriesGeoZoneService(TradenityClient client) {
        super(client);
    }

    protected CountriesGeoZoneResource getCountriesGeoZoneResource(){
        if(countriesGeoZoneResource == null) {
            countriesGeoZoneResource = resourceFactory.create(CountriesGeoZoneResource.class);
        }
        return countriesGeoZoneResource;
    }

    public Page<CountriesGeoZone> findAll(PageRequest pageRequest){
        Call<ResourcePage<CountriesGeoZone>> call =  getCountriesGeoZoneResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<CountriesGeoZone> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<CountriesGeoZone>> call =  getCountriesGeoZoneResource().index(params);
        return createPage(call);
    }

    public CountriesGeoZone findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public CountriesGeoZone findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<CountriesGeoZone> findAll(){
        return findAll(new PageRequest());
    }

    public Page<CountriesGeoZone> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<CountriesGeoZone> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<CountriesGeoZone> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<CountriesGeoZone> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<CountriesGeoZone> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<CountriesGeoZone> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public CountriesGeoZone findOne(Map<String, Object> fields){
        List<CountriesGeoZone> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public CountriesGeoZone findById(String id){
        Call<CountriesGeoZone> call =  getCountriesGeoZoneResource().findOne(id);
        return createInstance(call);
    }

    public CountriesGeoZone create(CountriesGeoZone countriesGeoZone){
        Call<CountriesGeoZone> call =  getCountriesGeoZoneResource().save(countriesGeoZone);
        return createInstance(call);
    }

    public CountriesGeoZone update(CountriesGeoZone countriesGeoZone){
        Call<CountriesGeoZone> call =  getCountriesGeoZoneResource().update(countriesGeoZone.getId(), countriesGeoZone);
        return createInstance(call);
    }

    public CountriesGeoZone replace(CountriesGeoZone countriesGeoZone){
        Call<CountriesGeoZone> call =  getCountriesGeoZoneResource().replace(countriesGeoZone.getId(), countriesGeoZone);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getCountriesGeoZoneResource().delete(id);
        run(call);
    }

    public void delete(CountriesGeoZone countriesGeoZone){
        delete(countriesGeoZone.getId());
    }
}