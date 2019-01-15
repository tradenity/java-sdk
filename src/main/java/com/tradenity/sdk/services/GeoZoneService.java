package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.GeoZoneResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeoZoneService extends AbstractService{

    GeoZoneResource geoZoneResource;

    public GeoZoneService(TradenityClient client) {
        super(client);
    }

    protected GeoZoneResource getGeoZoneResource(){
        if(geoZoneResource == null) {
            geoZoneResource = resourceFactory.create(GeoZoneResource.class);
        }
        return geoZoneResource;
    }

    public Page<GeoZone> findAll(PageRequest pageRequest){
        Call<ResourcePage<GeoZone>> call =  getGeoZoneResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<GeoZone> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<GeoZone>> call =  getGeoZoneResource().index(params);
        return createPage(call);
    }

    public GeoZone findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public GeoZone findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<GeoZone> findAll(){
        return findAll(new PageRequest());
    }

    public Page<GeoZone> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<GeoZone> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<GeoZone> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<GeoZone> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<GeoZone> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<GeoZone> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public GeoZone findOne(Map<String, Object> fields){
        List<GeoZone> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }
}