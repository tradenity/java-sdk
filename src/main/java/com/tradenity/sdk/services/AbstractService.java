package com.tradenity.sdk.services;

import com.google.gson.Gson;
import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.exceptions.*;
import com.tradenity.sdk.exceptions.messages.*;
import com.tradenity.sdk.model.Page;
import com.tradenity.sdk.model.ResourcePage;
import com.tradenity.sdk.resources.ResourceFactory;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:58 PM
 */
public class AbstractService {
    protected TradenityClient client;
    protected String resourceName;
    protected ResourceFactory resourceFactory;


    public AbstractService(TradenityClient client, String resourceName) {
        this.client = client;
        this.resourceName = resourceName;
        this.resourceFactory = new ResourceFactory(client);
    }

    protected<M> M run(Call<M> call){
        try {
            Response<M> response = call.execute();
            int status = response.code();
            if(status >= 400 && status < 500){
                String cause = response.errorBody().string();
                throw createErrorException(cause);
            }else if (status >=500){
                String cause = response.errorBody().string();
                throw new ServerErrorException(cause);
            }
            return response.body();
        } catch (IOException e) {
            throw new ClientErrorException("Cannot execute request.", e);
        }
    }

    protected RequestErrorException createErrorException(String cause) {
        Gson gson = new Gson();
        ErrorMessage err = gson.fromJson(cause, ErrorMessage.class);

        if(err.getStatus() == 401){
            if(client.getSessionTokenStore().hasToken()){
                return new SessionExpiredException(err);
            }else {
                return new AuthenticationException(err.getMessage());
            }
        }else if(err.getErrorCode() == ApiError.ACCESS_DENIED_ERROR_CODE){
            return new AuthorizationException(err);
        }else if(err.getErrorCode() == ApiError.NOT_FOUND_ERROR_CODE){
            return new EntityNotFoundException(err);
        }else if(err.getErrorCode() == ApiError.DATA_VALIDATION_ERROR_CODE){
            return new DataValidationException(err);
        }else if(err.getErrorCode() == ApiError.INVALID_PAYMENT_ERROR_CODE){
            return new PaymentException(err);
        }else if(err.getErrorCode() == ApiError.GATEWAY_ERROR_ERROR_CODE){
            return new GatewayErrorException(err);
        }else if(err.getErrorCode() == ApiError.REFUND_ERROR_ERROR_CODE){
            return new RefundException(err);
        }else if(err.getErrorCode() == ApiError.CART_INVALID_ITEM_ERROR_CODE){
            return new ShoppingCartException(err);
        }else if(err.getErrorCode() == ApiError.INVENTORY_INVALID_PRODUCT_ERROR_CODE){
            return new InventoryErrorException(err);
        }else if(err.getErrorCode() == ApiError.INVENTORY_NOT_AVAILABLE_PRODUCT_ERROR_CODE){
            return new InventoryErrorException(err);
        }else if(err.getErrorCode() == ApiError.EXISTING_EMAIL_ERROR_CODE){
            return new CustomerCreationException(err);
        }else if(err.getErrorCode() == ApiError.EXISTING_USERNAME_ERROR_CODE){
            return new CustomerCreationException(err);
        }else {
            return new RequestErrorException(err);
        }
    }

    protected boolean isSuccessful(Call call){
        try {
            Response response = call.execute();
            int status = response.code();
            if(status >= 400 && status < 500){
                throw new RequestErrorException();
            }else if (status >=500){
                throw new ServerErrorException();
            }
            return true;
        } catch (IOException e) {
            throw new ClientErrorException("Cannot execute request.", e);
        }
    }

    protected<T> List<T> createList(Call<List<T>> call) {
        return run(call);
    }

    protected<T> T createInstance(Call<T> call) {
        return run(call);
    }

    protected<T> Page<T> createPage(Call<ResourcePage<T>> call) {
        ResourcePage<T> p = run(call);
        Map<String, List<T>> content = p.get_embedded();
        List<T> list;
        if(content != null) {
            list = content.get(this.resourceName);
        }else{
            list = new ArrayList<>();
        }
        return new Page<>(p.getPageInfo(), list);
    }

    protected Map<String, Object> withPrefix(String prefix, Map<String, Object> map){
        Map<String, Object> m = new HashMap<>();
        for(String key:map.keySet()){
            m.put(prefix+key, map.get(key));
        }
        return m;
    }

    protected Map<String, Object> notNullMap(Map<String, Object> oMap) {
        Map<String, Object> m = new HashMap<>();
        for(String key: oMap.keySet()){
            if(oMap.get(key) != null){
                m.put(key, oMap.get(key));
            }
        }
        return m;
    }
}
