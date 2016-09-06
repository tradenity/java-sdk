package com.tradenity.sdk.client;

/**
 * Created by joseph
 * on 4/12/16.
 */
public interface SessionTokenStore {
    String getAuthToken();

    void setAuthToken(String authToken);

    void resetToken();

    boolean hasToken();

}
