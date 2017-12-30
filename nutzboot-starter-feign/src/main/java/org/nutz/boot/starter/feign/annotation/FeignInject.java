package org.nutz.boot.starter.feign.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FeignInject {

    String apiBaseUrl() default "";

    String encoder() default "";

    String decoder() default "";
    
    /**
     * JAXB作为编码/解码器的时候必须填写
     */
    String schema() default "";
    
    String client() default "";
}
