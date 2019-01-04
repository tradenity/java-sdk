package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.StatesGeoZoneResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatesGeoZoneService extends AbstractService{

    StatesGeoZoneResource statesGeoZoneResource;

    public StatesGeoZoneService(TradenityClient client) {
        super(client);
    }

    protected StatesGeoZoneResource getStatesGeoZoneResource(){
        if(statesGeoZoneResource == null) {
            statesGeoZoneResource = resourceFactory.create(StatesGeoZoneResource.class);
        }
        return statesGeoZoneResource;
    }

    public Page<StatesGeoZone> findAll(PageRequest pageRequest){
        Call<ResourcePage<StatesGeoZone>> call =  getStatesGeoZoneResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<StatesGeoZone> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<StatesGeoZone>> call =  getStatesGeoZoneResource().index(fields);
        return createPage(call);
    }

    public StatesGeoZone findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public StatesGeoZone findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<StatesGeoZone> findAll(){
        return findAll(new PageRequest());
    }

    public Page<StatesGeoZone> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<StatesGeoZone> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<StatesGeoZone> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<StatesGeoZone> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<StatesGeoZone> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<StatesGeoZone> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public StatesGeoZone findOne(Map<String, Object> fields){
        List<StatesGeoZone> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public StatesGeoZone findById(String id){
        Call<StatesGeoZone> call =  getStatesGeoZoneResource().findOne(id);
        return createInstance(call);
    }

    public StatesGeoZone create(StatesGeoZone statesGeoZone){
        Call<StatesGeoZone> call =  getStatesGeoZoneResource().save(statesGeoZone);
        return createInstance(call);
    }

    public StatesGeoZone update(StatesGeoZone statesGeoZone){
        Call<StatesGeoZone> call =  getStatesGeoZoneResource().update(statesGeoZone.getId(), statesGeoZone);
        return createInstance(call);
    }

    public StatesGeoZone replace(StatesGeoZone statesGeoZone){
        Call<StatesGeoZone> call =  getStatesGeoZoneResource().replace(statesGeoZone.getId(), statesGeoZone);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getStatesGeoZoneResource().delete(id);
        run(call);
    }

    public void delete(StatesGeoZone statesGeoZone){
        delete(statesGeoZone.getId());
    }
}