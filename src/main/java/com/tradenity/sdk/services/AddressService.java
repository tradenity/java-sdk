package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.AddressResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressService extends AbstractService{

    AddressResource addressResource;

    public AddressService(TradenityClient client) {
        super(client);
    }

    protected AddressResource getAddressResource(){
        if(addressResource == null) {
            addressResource = resourceFactory.create(AddressResource.class);
        }
        return addressResource;
    }

    public Page<Address> findAll(PageRequest pageRequest){
        Call<ResourcePage<Address>> call =  getAddressResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Address> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Address>> call =  getAddressResource().index(params);
        return createPage(call);
    }

    public Address findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Address findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Address> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Address> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Address> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Address> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Address> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Address> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Address> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Address findOne(Map<String, Object> fields){
        List<Address> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Address findById(String id){
        Call<Address> call =  getAddressResource().findOne(id);
        return createInstance(call);
    }

    public Address create(Address address){
        Call<Address> call =  getAddressResource().save(address);
        return createInstance(call);
    }

    public Address update(Address address){
        Call<Address> call =  getAddressResource().update(address.getId(), address);
        return createInstance(call);
    }

    public Address replace(Address address){
        Call<Address> call =  getAddressResource().replace(address.getId(), address);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getAddressResource().delete(id);
        run(call);
    }

    public void delete(Address address){
        delete(address.getId());
    }
}