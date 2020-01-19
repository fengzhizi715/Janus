package com.netdiscovery.janus.core.loadbalancer;

import com.netdiscovery.janus.core.endpoint.Endpoint;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tony on 2019/12/29.
 */
public abstract class LoadBalancer implements LoadBalancerStrategy {

    @Override
    public Endpoint loadBalance(Collection<Endpoint> endpoints) {
        if (endpoints == null) {
            throw new IllegalArgumentException("endpoints collection of load balance should not be null !");
        }
        List<Endpoint> availables = availableEndpoints(endpoints);
        return doLoadBalance(availables);
    }

    protected abstract Endpoint doLoadBalance(List<Endpoint> availables);

    /**
     * Select only available endpoints
     *
     * @return
     */
    protected List<Endpoint> availableEndpoints(Collection<Endpoint> endpoints) {
        return endpoints
                .stream()
                .filter(Endpoint::available)
                .collect(Collectors.toList());
    }

}
