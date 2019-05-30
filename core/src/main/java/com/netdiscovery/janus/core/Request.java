package com.netdiscovery.janus.core;

import java.util.Map;

/**
 * Created by tony on 2019-05-31.
 */
public interface Request {

    Long getRequestId();

    String getInterfaceName();

    String getMethodName();

    Object[] getArguments();

    Class<?>[] getParameterTypes();

    Map<String, String> getAttachments();

    String getAttachment(String key);

    String getAttachment(String key, String defaultValue);

    void setAttachment(String key, String value);
}
