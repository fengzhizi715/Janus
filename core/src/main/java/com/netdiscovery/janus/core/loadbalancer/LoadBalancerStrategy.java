package com.netdiscovery.janus.core.loadbalancer;

import com.netdiscovery.janus.core.endpoint.Endpoint;

/**
 * Created by tony on 2019/12/29.
 */
public interface LoadBalancerStrategy {

    Endpoint next();
}
