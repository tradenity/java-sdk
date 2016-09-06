package com.tradenity.sdk.request;

import com.tradenity.sdk.client.SessionTokenStore;
import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 1:43 PM
 */
public class ApiInterceptor implements Interceptor {

    //public static final String AUTH_TOKEN_HEADER_NAME = "x-auth-token";
    public static final String AUTH_TOKEN_HEADER_NAME = "X-Tradenity-Session-ID";
    String apiKey;
    SessionTokenStore tokenStore;


    public ApiInterceptor(String apiKey, SessionTokenStore tokenStore) {
        this.apiKey = apiKey;
        this.tokenStore = tokenStore;
    }


    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        String credential = Credentials.basic(apiKey, "");
        // Customize the request
        Request.Builder builder = original.newBuilder()
                .header("Accept", "application/json")
                .method(original.method(), original.body());
        if(tokenStore.getAuthToken() != null) {
            builder.header(AUTH_TOKEN_HEADER_NAME, tokenStore.getAuthToken());
        }else {
            builder.header("Authorization", credential);
        }
        Request request = builder.build();
        Response response = chain.proceed(request);
        String newAuthToken = response.header(AUTH_TOKEN_HEADER_NAME);
        if(newAuthToken != null){
            tokenStore.setAuthToken(newAuthToken);
        }
        return response;
    }
}
