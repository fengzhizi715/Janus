package com.netdiscovery.janus.rpc;

import com.netdiscovery.janus.core.domain.URL;

/**
 * Created by tony on 2019-06-01.
 */
public interface Node {
    
    void init();

    void destroy();

    boolean isAvailable();

    String desc();

    URL getUrl();
}
