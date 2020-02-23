package com.netdiscovery.janus.core.loadbalancer;

import com.netdiscovery.janus.core.endpoint.Endpoint;

import java.util.List;

/**
 * @author bdq
 * @since 2020/1/14
 */
public class RoundRobinLoadBalancer extends LoadBalancer {
    private static final ThreadLocal<Integer> COUNT = ThreadLocal.withInitial(() -> 0);

    @Override
    protected Endpoint doLoadBalance(List<Endpoint> availables) {
        int size = availables.size();
        int index = COUNT.get() + 1;
        COUNT.set(index);
        return availables.get(index % size);
    }
}
