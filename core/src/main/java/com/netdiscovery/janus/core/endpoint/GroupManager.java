package com.netdiscovery.janus.core.endpoint;

import java.util.Collection;

/**
 * Created by tony on 2020/1/5.
 */
public interface GroupManager {

    LoadBalancedEndpointGroup get(String groupName);

    LoadBalancedEndpointGroup getDefault();

    Collection<LoadBalancedEndpointGroup> groups();
}
