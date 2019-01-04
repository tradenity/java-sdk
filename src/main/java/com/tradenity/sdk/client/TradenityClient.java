package com.tradenity.sdk.client;

public class TradenityClient {
    public String API_BASE_URL = "https://api.Tradenity.com/v1/";

    protected String apiKey = null;
    SessionTokenStore sessionTokenStore;

    public TradenityClient(String apiKey) {
        this.apiKey = apiKey;
        this.sessionTokenStore = new SingleUserTokenStore();
    }
    public TradenityClient(String baseUrl, String apiKey) {
        this.apiKey = apiKey;
        this.API_BASE_URL = baseUrl;
        this.sessionTokenStore = new SingleUserTokenStore();
    }
    public TradenityClient(String apiKey, SessionTokenStore tokenStore) {
        this.apiKey = apiKey;
        this.sessionTokenStore = tokenStore;
    }

    public TradenityClient(String baseUrl, String apiKey, SessionTokenStore tokenStore) {
        this.API_BASE_URL = baseUrl;
        this.apiKey = apiKey;
        this.sessionTokenStore = tokenStore;
    }

    public String getApiKey() {
        return apiKey;
    }

    public SessionTokenStore getSessionTokenStore() {
        return sessionTokenStore;
    }

    public void resetSession(){
        this.sessionTokenStore.resetToken();
    }

}