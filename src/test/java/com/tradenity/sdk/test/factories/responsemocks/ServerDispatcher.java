package com.tradenity.sdk.test.factories.responsemocks;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import java.util.ArrayList;
import java.util.List;

import static com.tradenity.sdk.test.factories.responsemocks.ServerDispatcher.WebRequest.*;

/**
 * Created by joseph
 * on 1/11/16.
 */
public class ServerDispatcher extends Dispatcher{

    List<WebRequest>requests = new ArrayList<>();

    public ServerDispatcher(MockWebServer server) {
        server.setDispatcher(this);
        addRequestSpec(GET, "/api/v1/brands", ResponseData.BrandsList);
        addRequestSpec(GET, "/api/v1/brands/brand_001", ResponseData.ShowBrand);
        addRequestSpec(POST, "/api/v1/brands", CREATED, ResponseData.ShowBrand);
        addRequestSpec(PUT, "/api/v1/brands/brand_001", ResponseData.ShowBrand);
        addRequestSpec(DELETE, "/api/v1/brands/brand_001", OK, "");
    }

    private void addRequestSpec(String method, String url, String body) {
        requests.add(new WebRequest(method, url, body));
    }
    private void addRequestSpec(String method, String url, int status) {
        requests.add(new WebRequest(method, url, status));
    }
    private void addRequestSpec(String method, String url, int statusCode, String body) {
        requests.add(new WebRequest(method, url, statusCode, body));
    }

    @Override
    public MockResponse dispatch(RecordedRequest request) throws InterruptedException {
        for(WebRequest r: requests) {
            if (request.getMethod().toLowerCase().equals(r.getMethod()) && getURI(request).equals(r.getPath())) {
                return new MockResponse().setResponseCode(r.getStatusCode()).setBody(r.getBody());
            }
        }
        return new MockResponse().setResponseCode(404);
    }

    private String getURI(RecordedRequest request) {
        return request.getPath().split("\\?")[0];
    }


    public static class WebRequest{
        public static final String GET = "get";
        public static final String POST = "post";
        public static final String PUT = "put";
        public static final String DELETE = "delete";

        public static final int OK = 200;
        public static final int CREATED = 201;
        public static final int BAD_REQUEST = 400;
        public static final int UNAUTHORIZED = 401;
        public static final int ACCESS_DENIED = 403;
        public static final int NOT_FOUND = 404;
        public static final int SERVER_ERROR = 500;


        String method;
        String path;
        int statusCode = 200;
        String body;

        public WebRequest() {
        }

        public WebRequest(String method, String path, String body) {
            this.method = method;
            this.path = path;
            this.body = body;
        }

        public WebRequest(String method, String path, int statusCode) {
            this.method = method;
            this.path = path;
            this.statusCode = statusCode;
        }

        public WebRequest(String method, String path, int statusCode, String body) {
            this.method = method;
            this.path = path;
            this.statusCode = statusCode;
            this.body = body;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }

}
