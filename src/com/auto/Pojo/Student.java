package com.auto.Pojo;

public class Student {
    private String name;
    private Integer age;

    public void introMyself(){
        System.out.println("name" + name + "age" + age);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
