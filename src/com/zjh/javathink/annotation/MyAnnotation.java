package com.zjh.javathink.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyAnnotation {

    //该注解的传入参数，studentName是传入参数的名称，String是传入参数的类型
//    String studentName() default "";
    String studentName();

    int id();

    String[] grilFriends();

}
