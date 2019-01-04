package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.GatewayResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GatewayService extends AbstractService{

    GatewayResource gatewayResource;

    public GatewayService(TradenityClient client) {
        super(client);
    }

    protected GatewayResource getGatewayResource(){
        if(gatewayResource == null) {
            gatewayResource = resourceFactory.create(GatewayResource.class);
        }
        return gatewayResource;
    }

    public Page<Gateway> findAll(PageRequest pageRequest){
        Call<ResourcePage<Gateway>> call =  getGatewayResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Gateway> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Gateway>> call =  getGatewayResource().index(fields);
        return createPage(call);
    }

    public Gateway findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Gateway findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Gateway> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Gateway> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Gateway> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Gateway> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Gateway> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Gateway> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Gateway> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Gateway findOne(Map<String, Object> fields){
        List<Gateway> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }
}