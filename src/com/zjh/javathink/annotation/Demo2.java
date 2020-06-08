package com.zjh.javathink.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 */
public class Demo2 {
    public static void main(String[] args){
        try {
            Class claxx = Class.forName("com.zjh.javathink.annotation.StuTable");
            //获得当前类中的所有注解
            Annotation[] annotations = claxx.getAnnotations();
            for (Annotation a :
                    annotations) {
                System.out.println(a);
            }

            //或者
            Target target =(Target)claxx.getAnnotation(Target.class);
            System.out.println(target.value());

            //获得类指定注解的值
            Class clazz = Class.forName("com.zjh.javathink.annotation.Student");
            Field field = clazz.getDeclaredField("name");
            StuField stuField = field.getAnnotation(StuField.class);
            System.out.println(stuField.columnName()+"--"+stuField.type()+"--"+stuField.length());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
