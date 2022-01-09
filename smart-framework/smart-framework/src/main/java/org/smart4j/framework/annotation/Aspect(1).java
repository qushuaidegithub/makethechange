package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by lenovo on 2017/5/29.
 * 切面注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    /**
     * 注解
     * @return
     */
    Class<? extends Annotation> value();
}
