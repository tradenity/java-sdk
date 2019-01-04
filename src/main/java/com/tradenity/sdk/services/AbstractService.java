package com.tradenity.sdk.services;

import com.google.gson.Gson;
import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.exceptions.*;
import com.tradenity.sdk.exceptions.messages.*;
import com.tradenity.sdk.model.Page;
import com.tradenity.sdk.request.CallExecutor;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.ResourceFactory;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AbstractService {
    protected TradenityClient client;
    protected ResourceFactory resourceFactory;
    protected CallExecutor callExecutor;


    public AbstractService(TradenityClient client) {
        this.client = client;
        this.resourceFactory = new ResourceFactory(client);
        this.callExecutor = new CallExecutor(client);
    }

    protected<M> M run(Call<M> call){
        return callExecutor.run(call);
    }

    protected<T> List<T> createList(Call<List<T>> call) {
        return run(call);
    }

    protected<T> T createInstance(Call<T> call) {
        return run(call);
    }

    protected<T> Page<T> createPage(Call<ResourcePage<T>> call) {
        ResourcePage<T> p = run(call);
        return Page.create(p);
    }

}