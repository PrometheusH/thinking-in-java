package com.zjh.javathink.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StuField {
    //列名
    String columnName();
    //类型
    String type();
    //长度
    int length();
    //是否为空，以后再加

}
