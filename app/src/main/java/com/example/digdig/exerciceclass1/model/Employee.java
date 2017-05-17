package com.example.digdig.exerciceclass1.model;

import java.io.Serializable;

/**
 * Created by digdig on 17-05-16.
 */

public class Employee extends Person  {
    private int empNum;
    private String job;
    private float salary;


    public Employee(String name, int age, int picture, int empNum, String job, float salary) {
        super(name, age, picture);
        this.empNum = empNum;
        this.job = job;
        this.salary = salary;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\n "+getJob()+" , "+getSalary();
    }
}
