package com.netdiscovery.janus.core.loadbalancer;

import com.netdiscovery.janus.core.endpoint.Endpoint;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tony on 2019/12/29.
 */
public abstract class LoadBalancer implements LoadBalancerStrategy {

    protected Collection<Endpoint> endpoints;

    LoadBalancer(Collection<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * Select only available endpoints
     * @return
     */
    protected List<Endpoint> endpoints() {
        return endpoints
                .stream()
                .filter(Endpoint::available)
                .collect(Collectors.toList());
    }

    @Override
    public Endpoint next() {
        return nextEndpoint();
    }

    abstract Endpoint nextEndpoint();
}
