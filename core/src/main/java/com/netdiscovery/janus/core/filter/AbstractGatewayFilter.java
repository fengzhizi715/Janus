package com.netdiscovery.janus.core.filter;

/**
 * @FileName: com.netdiscovery.janus.core.filter.AbstractGatewayFilter
 * @author: Tony Shen
 * @date: 2020-03-22 20:48
 * @version: V1.0 <描述当前版本功能>
 */
public abstract class AbstractGatewayFilter implements GatewayFilter, Comparable<AbstractGatewayFilter> {

    abstract public String filterType();

    abstract public int filterOrder();

    @Override
    public int compareTo(AbstractGatewayFilter filter) {
        return Integer.compare(this.filterOrder(), filter.filterOrder());
    }
}
