package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.StoreProfileResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreProfileService extends AbstractService{

    StoreProfileResource storeProfileResource;

    public StoreProfileService(TradenityClient client) {
        super(client);
    }

    protected StoreProfileResource getStoreProfileResource(){
        if(storeProfileResource == null) {
            storeProfileResource = resourceFactory.create(StoreProfileResource.class);
        }
        return storeProfileResource;
    }

    public StoreProfile findById(String id){
        Call<StoreProfile> call =  getStoreProfileResource().findOne(id);
        return createInstance(call);
    }

    public StoreProfile update(StoreProfile storeProfile){
        Call<StoreProfile> call =  getStoreProfileResource().update(storeProfile.getId(), storeProfile);
        return createInstance(call);
    }

    public StoreProfile replace(StoreProfile storeProfile){
        Call<StoreProfile> call =  getStoreProfileResource().replace(storeProfile.getId(), storeProfile);
        return createInstance(call);
    }
}