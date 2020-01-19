package com.netdiscovery.janus.core.loadbalancer;

import com.netdiscovery.janus.core.endpoint.Endpoint;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author bdq
 * @since 2020/1/14
 */
public class RoundRobinLoadBalancer extends LoadBalancer {
    private static final AtomicInteger INDEX = new AtomicInteger(0);

    @Override
    protected Endpoint doLoadBalance(List<Endpoint> availables) {
        int size = availables.size();
        int index = INDEX.getAndIncrement();
        return availables.get(index % size);
    }
}
