package com.netdiscovery.janus.rpc;

import com.netdiscovery.janus.core.Request;
import com.netdiscovery.janus.core.Response;

/**
 * Created by tony on 2019-06-02.
 */
public interface Caller<T> extends Node {

    Class<T> getInterface();

    Response call(Request request);
}
