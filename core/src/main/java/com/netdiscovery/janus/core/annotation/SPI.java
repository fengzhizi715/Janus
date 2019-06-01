package com.netdiscovery.janus.core.annotation;

import com.netdiscovery.janus.core.constant.Scope;

import java.lang.annotation.*;

/**
 * Created by tony on 2019-05-31.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface SPI {

    /**
     * 缺省扩展点名。
     */
    String value() default "";

    Scope scope() default Scope.SINGLETON;
}
