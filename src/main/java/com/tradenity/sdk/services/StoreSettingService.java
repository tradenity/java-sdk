package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.StoreSettingResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreSettingService extends AbstractService{

    StoreSettingResource storeSettingResource;

    public StoreSettingService(TradenityClient client) {
        super(client);
    }

    protected StoreSettingResource getStoreSettingResource(){
        if(storeSettingResource == null) {
            storeSettingResource = resourceFactory.create(StoreSettingResource.class);
        }
        return storeSettingResource;
    }

    public StoreSetting findById(String id){
        Call<StoreSetting> call =  getStoreSettingResource().findOne(id);
        return createInstance(call);
    }

    public StoreSetting update(StoreSetting storeSetting){
        Call<StoreSetting> call =  getStoreSettingResource().update(storeSetting.getId(), storeSetting);
        return createInstance(call);
    }

    public StoreSetting replace(StoreSetting storeSetting){
        Call<StoreSetting> call =  getStoreSettingResource().replace(storeSetting.getId(), storeSetting);
        return createInstance(call);
    }
}