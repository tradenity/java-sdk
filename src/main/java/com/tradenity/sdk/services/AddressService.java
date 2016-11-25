package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.AddressResource;
import com.tradenity.sdk.resources.ResourcePage;
import retrofit2.Call;

import java.util.HashMap;
import java.util.Map;


/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:06 PM
 */
public class AddressService extends AbstractService{

    AddressResource addressResource;

    public AddressService(TradenityClient client) {
        super(client, "addresses");
    }

    protected AddressResource getAddressResource(){
        if(addressResource == null) {
            addressResource = resourceFactory.create(AddressResource.class);
        }
        return addressResource;
    }

    public Page<Address> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Address> findAll(PageRequest pageRequest){
        Call<ResourcePage<Address>> call =  getAddressResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Address> search(Address address){
        return search(address, new PageRequest());
    }

    public Page<Address> search(Address address, PageRequest pageRequest){
        return search(notNullMap(toMap(address)), pageRequest);
    }

    public Page<Address> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Page<Address> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }
        Call<ResourcePage<Address>> call =  getAddressResource().index(fields);
        return createPage(call);
    }

    public Address findById(String id){
        Call<Address> call = getAddressResource().findById(id);
        return createInstance(call);
    }

    public Address create(Address address){
        Call<Address> call = getAddressResource().save(toMap(address));
        return createInstance(call);
    }

    public Address update(Address address){
        Call<Address> call = getAddressResource().update(address.getId(), toMap(address));
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getAddressResource().delete(id);
        run(call);
    }

    public void delete(Address address){
        delete(address.getId());
    }

    private Map<String, Object> toMap(Address address) {
        Map<String, Object> m = new HashMap<>();
        m.put("streetLine1", address.getStreetLine1());
        m.put("streetLine2", address.getStreetLine2());
        m.put("city", address.getCity());
        m.put("state", address.getState());
        m.put("zipCode", address.getZipCode());
        m.put("country", address.getCountry());
        return m;
    }


}
