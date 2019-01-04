package com.tradenity.sdk.resources.transport.utils;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;

import java.io.IOException;

public class OkHttpDebugInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if (request.body() != null) {
            try {
                final Request copy = request.newBuilder().build();
                final Buffer buffer = new Buffer();
                copy.body().writeTo(buffer);
                System.out.println("Request Body for: " + copy.url().toString() + ", Body: " +  buffer.readUtf8());
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
        return chain.proceed(request);
    }
}