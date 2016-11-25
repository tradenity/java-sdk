package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.GatewayResource;
import com.tradenity.sdk.resources.ResourcePage;
import retrofit2.Call;

import java.util.HashMap;
import java.util.Map;


/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:06 PM
 */
public class GatewayService extends AbstractService{
    GatewayResource gatewayResource;
    public GatewayService(TradenityClient client) {
        super(client, "gateways");
    }
    protected GatewayResource getGatewayResource(){
        if(gatewayResource == null) {
            gatewayResource = resourceFactory.create(GatewayResource.class);
        }
        return gatewayResource;
    }

    public Page<Gateway> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Gateway> findAll(PageRequest pageRequest){
        Call<ResourcePage<Gateway>> call =  getGatewayResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Gateway> search(Gateway gateway){
        return search(gateway, new PageRequest());
    }

    public Page<Gateway> search(Gateway gateway, PageRequest pageRequest){
        return search(notNullMap(toMap(gateway)), pageRequest);
    }

    public Page<Gateway> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Page<Gateway> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }
        Call<ResourcePage<Gateway>> call =  getGatewayResource().index(fields);
        return createPage(call);
    }

    public Gateway findById(String id){
        Call<Gateway> call =  getGatewayResource().findById(id);
        return createInstance(call);
    }

    public Gateway create(Gateway gateway){
        Call<Gateway> call =  getGatewayResource().save(toMap(gateway));
        return createInstance(call);
    }

    public Gateway update(Gateway gateway){
        Call<Gateway> call =  getGatewayResource().update(gateway.getId(), toMap(gateway));
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getGatewayResource().delete(id);
        run(call);
    }

    public void delete(Gateway gateway){
        delete(gateway.getId());
    }

    public Map<String, Object> toMap(Gateway gateway) {
        Map<String, Object> m = new HashMap<>();
        m.put("name", gateway.getName());
        m.put("title", gateway.getTitle());
        m.put("status", gateway.getStatus());
        m.put("description", gateway.getDescription());
        m.put("mode", gateway.getMode());
        m.put("accountId", gateway.getAccountId());
        m.put("secretKey", gateway.getSecretKey());
        m.put("publicKey", gateway.getPublicKey());
        m.put("testSecretKey", gateway.getTestSecretKey());
        m.put("testPublicKey", gateway.getTestPublicKey());
        return m;
    }
}
