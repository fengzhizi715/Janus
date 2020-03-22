package com.netdiscovery.janus.core.domain;

import io.netty.handler.codec.http.HttpMethod;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @FileName: com.netdiscovery.janus.core.domain.Route
 * @author: Tony Shen
 * @date: 2020-03-22 22:02
 * @version: V1.0 <描述当前版本功能>
 */
@Data
@Slf4j
public class Route implements Cloneable {

    private Long id;

    private String path;

    private URL mapUrl; // 后端映射的URL

    private HttpMethod method; // 请求方法

    private Integer timeoutInMilliseconds;// 请求超时时间

    private static final Integer DEFAULT_TIMEOUT = 3000;

    public Route() {
    }

    public Route(Long id, HttpMethod method, String path, URL mapUrl) {
        this(id, method, path, mapUrl, DEFAULT_TIMEOUT);
    }

    public Route(Long id, HttpMethod method, String path, URL mapUrl, Integer timeoutInMilliseconds) {
        this.id = id;
        this.path = path;
        this.mapUrl = mapUrl;
        this.method = method;
        this.timeoutInMilliseconds = timeoutInMilliseconds;
    }

    @Override
    protected Route clone() {
        Route route = this;
        try {
            route = (Route) super.clone();
        } catch (CloneNotSupportedException e) {
            log.error(e.getMessage());
        }
        return route;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return this.id.equals(((Route) obj).id);
    }
}
