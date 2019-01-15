package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.TestGatewayResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGatewayService extends AbstractService{

    TestGatewayResource testGatewayResource;

    public TestGatewayService(TradenityClient client) {
        super(client);
    }

    protected TestGatewayResource getTestGatewayResource(){
        if(testGatewayResource == null) {
            testGatewayResource = resourceFactory.create(TestGatewayResource.class);
        }
        return testGatewayResource;
    }

    public Page<TestGateway> findAll(PageRequest pageRequest){
        Call<ResourcePage<TestGateway>> call =  getTestGatewayResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<TestGateway> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<TestGateway>> call =  getTestGatewayResource().index(params);
        return createPage(call);
    }

    public TestGateway findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public TestGateway findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<TestGateway> findAll(){
        return findAll(new PageRequest());
    }

    public Page<TestGateway> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<TestGateway> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<TestGateway> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<TestGateway> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<TestGateway> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<TestGateway> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public TestGateway findOne(Map<String, Object> fields){
        List<TestGateway> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public TestGateway findById(String id){
        Call<TestGateway> call =  getTestGatewayResource().findOne(id);
        return createInstance(call);
    }

    public TestGateway create(TestGateway testGateway){
        Call<TestGateway> call =  getTestGatewayResource().save(testGateway);
        return createInstance(call);
    }

    public TestGateway update(TestGateway testGateway){
        Call<TestGateway> call =  getTestGatewayResource().update(testGateway.getId(), testGateway);
        return createInstance(call);
    }

    public TestGateway replace(TestGateway testGateway){
        Call<TestGateway> call =  getTestGatewayResource().replace(testGateway.getId(), testGateway);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getTestGatewayResource().delete(id);
        run(call);
    }

    public void delete(TestGateway testGateway){
        delete(testGateway.getId());
    }
}