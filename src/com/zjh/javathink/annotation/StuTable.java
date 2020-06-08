package com.zjh.javathink.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 */
//不能修饰方法，修饰类，表示的是类和表之间的转化
@Target(value ={ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface StuTable {
    //表名
    String value();
}
