package com.netdiscovery.janus.core.endpoint;

/**
 * Created by tony on 2019/12/29.
 */
public interface Endpoint {

    /**
     * Endpoint name.
     * @return Endpoint name.
     */
    String name();

    /**
     * Endpoint target.
     * @return Endpoint target.
     */
    String target();

    /**
     * Endpoint weight.
     *
     * @return
     */
    int weight();

    boolean available();
}
