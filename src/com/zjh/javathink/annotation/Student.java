package com.zjh.javathink.annotation;

/**
 * ORM Object Relationship Mapping
 * 运行时根据类生成sql语句
 *
 */

@StuTable("student")
public class Student {
    @StuField(columnName = "id",type = "int" ,length = 10)
    int id;
    @StuField(columnName = "name",type = "varchar" ,length = 20)
    String name;
    @StuField(columnName = "age",type = "int" ,length = 3)
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
