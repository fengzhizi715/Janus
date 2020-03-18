package com.netdiscovery.janus.core.endpoint;

import com.netdiscovery.janus.core.loadbalancer.LoadBalancerStrategy;

import java.util.Collection;

/**
 * Created by tony on 2020/1/5.
 */
public class LoadBalancedEndpointGroup implements LoadBalancerStrategy {

    private final String name;

    private final LoadBalancerStrategy strategy;

    public LoadBalancedEndpointGroup(final String name, final LoadBalancerStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    @Override
    public Endpoint loadBalance(Collection<Endpoint> endpoints) {
        return strategy.loadBalance(endpoints);
    }
}
