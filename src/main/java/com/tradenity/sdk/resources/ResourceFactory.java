package com.tradenity.sdk.resources;

import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.resources.transport.Transport;

public class ResourceFactory {

    protected TradenityClient apiClient;
    protected Transport transport;

    public ResourceFactory(TradenityClient client) {
        this.apiClient = client;
        this.transport = new Transport(client);
    }

    public <T> T create(Class<T> resource){
        return transport.get().create(resource);
    }
}