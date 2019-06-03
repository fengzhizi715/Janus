package com.netdiscovery.janus.rpc;

import com.netdiscovery.janus.core.domain.URL;

/**
 * Created by tony on 2019-06-03.
 */
public interface Reference<T> extends Caller<T>  {

    /**
     * 当前Reference的调用次数
     * @return
     */
    int activeCount();

    URL getServiceUrl();
}
