package com.tradenity.sdk.resources.transport;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.request.ApiInterceptor;
import com.tradenity.sdk.resources.transport.utils.ModelPostProcessorTypeAdapterFactory;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class Transport {
    private Retrofit builder;
    private TradenityClient apiClient;

    public Transport(TradenityClient client) {
        this.apiClient = client;
    }

    public Retrofit get() {
        if(builder == null){
            builder = createRetrofit();
        }
        return builder;
    }

    private Retrofit createRetrofit() {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.addInterceptor(new ApiInterceptor(apiClient.getApiKey(), apiClient.getSessionTokenStore()));
        //clientBuilder.addInterceptor(new OkHttpDebugInterceptor());
        clientBuilder.connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20L, TimeUnit.SECONDS)
                .writeTimeout(20L, TimeUnit.SECONDS);
        OkHttpClient client = clientBuilder.build();
        Retrofit.Builder builder = new Retrofit.Builder();
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                .registerTypeAdapterFactory(new ModelPostProcessorTypeAdapterFactory())
                .create();
        return builder
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(apiClient.API_BASE_URL)
                .build();
    }

}