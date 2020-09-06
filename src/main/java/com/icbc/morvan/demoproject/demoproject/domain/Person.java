package com.icbc.morvan.demoproject.demoproject.domain;

/**
 * @author morvan
 * @time 2020-9-5
 * @description: this is a class for testing whether we could send params from front-end by "requestbody" to back-end
 */
public class Person {
    private String name;
    private String password;
    private int age;

    public Person() {
    }

    public Person(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
