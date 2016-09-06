package com.tradenity.sdk.test.integration;

import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.test.factories.responsemocks.ServerDispatcher;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.IOException;

/**
 * Created by joseph
 * on 1/11/16.
 */
public class BaseServiceIntegrationTest {
    protected static MockWebServer server;
    protected static String baseUrl;

    @BeforeClass
    public static void setupClass(){
        server = new MockWebServer();
        new ServerDispatcher(server);
        try {
            server.start();
            baseUrl = server.url("/api/v1/").toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void teardownClass(){
        try {
            server.shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected TradenityClient getSession() {
        return new TradenityClient(baseUrl, "");
    }
}
