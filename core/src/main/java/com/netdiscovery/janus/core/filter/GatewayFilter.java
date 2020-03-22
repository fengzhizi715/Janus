package com.netdiscovery.janus.core.filter;

import io.netty.channel.Channel;

/**
 * @FileName: com.netdiscovery.janus.core.filter.GatewayFilter
 * @author: Tony Shen
 * @date: 2020-03-22 20:37
 * @version: V1.0 <描述当前版本功能>
 */
public interface GatewayFilter {

    /**
     * 过滤 Http 请求
     * @param channel
     * @throws Exception
     */
    void filter(Channel channel) throws Exception;
}
