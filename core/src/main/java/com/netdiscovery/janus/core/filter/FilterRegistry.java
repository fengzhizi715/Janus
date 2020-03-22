package com.netdiscovery.janus.core.filter;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @FileName: com.netdiscovery.janus.core.filter.FilterRegistry
 * @author: Tony Shen
 * @date: 2020-03-22 20:59
 * @version: V1.0 <描述当前版本功能>
 */
public class FilterRegistry {

    private final ConcurrentHashMap<String, AbstractGatewayFilter> filters = new ConcurrentHashMap<>();

    private FilterRegistry() {
    }

    public AbstractGatewayFilter remove(String key) {
        return this.filters.remove(key);
    }

    public AbstractGatewayFilter get(String key) {
        return this.filters.get(key);
    }

    public void put(String key, AbstractGatewayFilter filter) {
        this.filters.putIfAbsent(key, filter);
    }

    public int size() {
        return this.filters.size();
    }

    public Collection<AbstractGatewayFilter> getAllFilters() {
        return this.filters.values();
    }

    public static final FilterRegistry getInsatance() {
        return FilterRegistry.Holder.instance;
    }

    private static class Holder {
        private static final FilterRegistry instance = new FilterRegistry();
    }
}
