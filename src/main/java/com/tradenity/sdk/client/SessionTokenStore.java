package com.tradenity.sdk.client;


public interface SessionTokenStore {
    String getAuthToken();

    void setAuthToken(String authToken);

    void resetToken();

    boolean hasToken();

}