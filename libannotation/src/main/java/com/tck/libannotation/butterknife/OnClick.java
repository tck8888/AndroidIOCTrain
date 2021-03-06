package com.tck.libannotation.butterknife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>description:</p>
 * <p>created on: 2020/1/21 15:37</p>
 *
 * @author tck
 * @version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface OnClick {

    int value();
}
