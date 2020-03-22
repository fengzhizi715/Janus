package com.netdiscovery.janus.core.route;

import com.netdiscovery.janus.core.domain.Route;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;
import lombok.extern.slf4j.Slf4j;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;

/**
 * @FileName: com.netdiscovery.janus.core.route.AbstractRouteMapper
 * @author: Tony Shen
 * @date: 2020-03-22 22:06
 * @version: V1.0 <描述当前版本功能>
 */
@Slf4j
public abstract class AbstractRouteMapper implements RouteMapper {

    private List<Route> routeList;

    @Override
    public Route getRoute(String path, HttpMethod method) {
        return null;
    }

    @Override
    public Route getRoute(HttpRequest request) {
        try {
            return getRoute(new URI(request.uri()).getPath(), request.method());
        } catch (URISyntaxException e) {
            log.error(e.getMessage());
        }
        return null;
    }

    /**
     * 获取路由列表
     * @param ids 路由id的列表
     * @return
     */
    protected abstract List<Route> locateRouteList(Set<Long> ids);

    @Override
    public void refresh(Set<Long> ids) {
        routeList = locateRouteList(ids);
    }

    @Override
    public List<Route> getRouteList() {
        return routeList;
    }
}
