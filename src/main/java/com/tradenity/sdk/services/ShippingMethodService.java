package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ShippingMethodResource;
import retrofit2.Call;

import java.util.HashMap;
import java.util.Map;


/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:06 PM
 */
public class ShippingMethodService extends AbstractService{

    ShippingMethodResource shippingMethodResource;

    public ShippingMethodService(TradenityClient client) {
        super(client, "shippingMethods");
    }

    protected ShippingMethodResource getShippingMethodResource(){
        if(shippingMethodResource == null) {
            shippingMethodResource = resourceFactory.create(ShippingMethodResource.class);
        }
        return shippingMethodResource;
    }

    public Page<ShippingMethod> findAll(){
        return findAll(new PageRequest());
    }

    public Page<ShippingMethod> findAll(PageRequest pageRequest){
        Call<ResourcePage<ShippingMethod>> call =  getShippingMethodResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<ShippingMethod> search(ShippingMethod shippingMethod){
        return search(shippingMethod, new PageRequest());
    }

    public Page<ShippingMethod> search(ShippingMethod shippingMethod, PageRequest pageRequest){
        return search(notNullMap(toMap(shippingMethod)), pageRequest);
    }

    public Page<ShippingMethod> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Page<ShippingMethod> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }
        Call<ResourcePage<ShippingMethod>> call =  getShippingMethodResource().index(fields);
        return createPage(call);
    }

    public ShippingMethod findById(String id){
        Call<ShippingMethod> call =  getShippingMethodResource().findById(id);
        return createInstance(call);
    }

    public ShippingMethod create(ShippingMethod shippingMethod){
        Call<ShippingMethod> call =  getShippingMethodResource().save(toMap(shippingMethod));
        return createInstance(call);
    }

    public ShippingMethod update(ShippingMethod shippingMethod){
        Call<ShippingMethod> call =  getShippingMethodResource().update(shippingMethod.getId(), notNullMap(toMap(shippingMethod)));
        return createInstance(call);
    }

    public boolean delete(String id){
        Call<Void> call =  getShippingMethodResource().delete(id);
        return isSuccessful(call);
    }

    public boolean delete(ShippingMethod shippingMethod){
        return delete(shippingMethod.getId());
    }

    public Map<String, Object> toMap(ShippingMethod shippingMethod) {
        Map<String, Object> m = new HashMap<>();
        m.put("name", shippingMethod.getName());
        m.put("title", shippingMethod.getTitle());
        m.put("status", shippingMethod.getStatus());
        m.put("description", shippingMethod.getDescription());
        m.put("costType", shippingMethod.getCostType());
        m.put("fixedRate", shippingMethod.getFixedRate());
        m.put("costPerUnitWeight", shippingMethod.getCostPerUnitWeight());
        m.put("weightUnit", shippingMethod.getWeightUnit());
        return m;
    }

}
