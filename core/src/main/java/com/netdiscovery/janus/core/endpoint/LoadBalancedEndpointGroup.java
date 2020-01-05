package com.netdiscovery.janus.core.endpoint;

import com.netdiscovery.janus.core.loadbalancer.LoadBalancerStrategy;

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

    @Override
    public Endpoint next() {
        return strategy.next();
    }

    public String getName() {
        return name;
    }
}
