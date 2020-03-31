package com.netdiscovery.janus.core.exception;

import io.netty.handler.codec.http.HttpResponseStatus;

/**
 * @FileName: com.netdiscovery.janus.core.exception.GatewayException
 * @author: Tony Shen
 * @date: 2020-03-31 13:42
 * @version: V1.0 <描述当前版本功能>
 */
public class GatewayException extends RuntimeException {

    private HttpResponseStatus status;
    private String message;

    public GatewayException(HttpResponseStatus status, String message) {
        super(message);
        this.status = status;
        this.message = message;
    }
}
