package com.netdiscovery.janus.core.loadbalancer;

import com.netdiscovery.janus.core.endpoint.Endpoint;

import java.util.*;

/**
 * @author bdq
 * @since 2020/1/14
 */
public class RandomLoadBalancer extends LoadBalancer {

    @Override
    protected Endpoint doLoadBalance(List<Endpoint> availables) {
        int size = availables.size();
        int index = new Random().nextInt(size);
        return availables.get(index);
    }
}
