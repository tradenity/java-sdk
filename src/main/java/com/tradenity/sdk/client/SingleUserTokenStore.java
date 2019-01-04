package com.tradenity.sdk.client;


public class SingleUserTokenStore implements SessionTokenStore{
    String authToken;

    @Override
    public String getAuthToken() {
        return authToken;
    }

    @Override
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    @Override
    public void resetToken() {
        this.authToken = null;
    }

    @Override
    public boolean hasToken() {
        return authToken != null;
    }
}