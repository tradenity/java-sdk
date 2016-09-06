package com.tradenity.sdk.resources;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.request.ApiInterceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by joseph
 * on 4/12/16.
 */
public class ResourceFactory {
    protected TradenityClient apiClient;

    public ResourceFactory(TradenityClient client) {
        this.apiClient = client;
    }
    private Retrofit builder;
    protected Retrofit getBuilder() {
        if(builder == null){
            builder = createRetrofit();
        }
        return builder;
    }

    public <T> T create(Class<T> resource){
        return getBuilder().create(resource);
    }

    private Retrofit createRetrofit() {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.addInterceptor(new ApiInterceptor(apiClient.getApiKey(), apiClient.getSessionTokenStore()));
        OkHttpClient client = clientBuilder.build();
        Retrofit.Builder builder = new Retrofit.Builder();
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                .create();
        return builder
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(apiClient.API_BASE_URL)
                .build();
    }
}
