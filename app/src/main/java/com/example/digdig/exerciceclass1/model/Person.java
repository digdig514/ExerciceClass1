package com.example.digdig.exerciceclass1.model;

import java.io.Serializable;

/**
 * Created by digdig on 17-05-16.
 */

public class Person implements Serializable {
    private String name;
    private int age;
    private int picture;

    public Person(String name, int age, int picture) {
        this.name = name;
        this.age = age;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return getName()+" , "+getAge();
    }
}
