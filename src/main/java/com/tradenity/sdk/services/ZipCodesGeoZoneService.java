package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.ZipCodesGeoZoneResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZipCodesGeoZoneService extends AbstractService{

    ZipCodesGeoZoneResource zipCodesGeoZoneResource;

    public ZipCodesGeoZoneService(TradenityClient client) {
        super(client);
    }

    protected ZipCodesGeoZoneResource getZipCodesGeoZoneResource(){
        if(zipCodesGeoZoneResource == null) {
            zipCodesGeoZoneResource = resourceFactory.create(ZipCodesGeoZoneResource.class);
        }
        return zipCodesGeoZoneResource;
    }

    public Page<ZipCodesGeoZone> findAll(PageRequest pageRequest){
        Call<ResourcePage<ZipCodesGeoZone>> call =  getZipCodesGeoZoneResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<ZipCodesGeoZone> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<ZipCodesGeoZone>> call =  getZipCodesGeoZoneResource().index(params);
        return createPage(call);
    }

    public ZipCodesGeoZone findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public ZipCodesGeoZone findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<ZipCodesGeoZone> findAll(){
        return findAll(new PageRequest());
    }

    public Page<ZipCodesGeoZone> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<ZipCodesGeoZone> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<ZipCodesGeoZone> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<ZipCodesGeoZone> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<ZipCodesGeoZone> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<ZipCodesGeoZone> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public ZipCodesGeoZone findOne(Map<String, Object> fields){
        List<ZipCodesGeoZone> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public ZipCodesGeoZone findById(String id){
        Call<ZipCodesGeoZone> call =  getZipCodesGeoZoneResource().findOne(id);
        return createInstance(call);
    }

    public ZipCodesGeoZone create(ZipCodesGeoZone zipCodesGeoZone){
        Call<ZipCodesGeoZone> call =  getZipCodesGeoZoneResource().save(zipCodesGeoZone);
        return createInstance(call);
    }

    public ZipCodesGeoZone update(ZipCodesGeoZone zipCodesGeoZone){
        Call<ZipCodesGeoZone> call =  getZipCodesGeoZoneResource().update(zipCodesGeoZone.getId(), zipCodesGeoZone);
        return createInstance(call);
    }

    public ZipCodesGeoZone replace(ZipCodesGeoZone zipCodesGeoZone){
        Call<ZipCodesGeoZone> call =  getZipCodesGeoZoneResource().replace(zipCodesGeoZone.getId(), zipCodesGeoZone);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getZipCodesGeoZoneResource().delete(id);
        run(call);
    }

    public void delete(ZipCodesGeoZone zipCodesGeoZone){
        delete(zipCodesGeoZone.getId());
    }
}