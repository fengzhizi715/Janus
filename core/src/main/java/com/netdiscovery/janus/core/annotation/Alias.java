package com.netdiscovery.janus.core.annotation;

import java.lang.annotation.*;

/**
 * Created by tony on 2019-05-31.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Alias {

    String value() default "";
}
