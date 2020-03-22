package com.netdiscovery.janus.core.route;

import com.netdiscovery.janus.core.domain.Route;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;

import java.util.List;
import java.util.Set;

/**
 * @FileName: com.netdiscovery.janus.core.route.RouteMapper
 * @author: Tony Shen
 * @date: 2020-03-22 21:59
 * @version: V1.0 <描述当前版本功能>
 */
public interface RouteMapper {

    /**
     * 根据路径获取Route
     * @param path
     * @param method
     * @return
     */
    Route getRoute(String path, HttpMethod method);

    /**
     * 根据请求获取Route
     * @param request
     * @return
     */
    Route getRoute(HttpRequest request);

    /**
     * 刷新路由
     * @param ids 路由id的列表
     */
    void refresh(Set<Long> ids);

    /**
     * 获取路由列表
     * @return
     */
    List<Route> getRouteList();
}
