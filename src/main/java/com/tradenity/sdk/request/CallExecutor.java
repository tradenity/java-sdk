package com.tradenity.sdk.request;

import com.google.gson.Gson;
import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.exceptions.ClientErrorException;
import com.tradenity.sdk.exceptions.ExceptionTranslator;
import com.tradenity.sdk.exceptions.messages.ErrorMessage;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class CallExecutor {
    private TradenityClient client;
    private ExceptionTranslator exceptionTranslator;

    public CallExecutor(TradenityClient client) {
        this.client = client;
        this.exceptionTranslator = new ExceptionTranslator(client);
    }

    public <M> M run(Call<M> call){
        try {
            Response<M> response = call.execute();
            if(response.code() >= 400 ){
                int statusCode = getStatusCode(response);
                ErrorMessage err = getErrorMessage(response);
                throw exceptionTranslator.createErrorException(statusCode, err);
            }else {
                return response.body();
            }
        } catch (IOException e) {
            throw new ClientErrorException("Cannot execute request.", e);
        }
    }

    protected <M> ErrorMessage getErrorMessage(Response<M> response) throws IOException {
        String cause = response.errorBody().string();
        Gson gson = new Gson();
        return gson.fromJson(cause, ErrorMessage.class);
    }

    protected  <M> int getStatusCode(Response<M> response) {
        return response.code();
    }
}