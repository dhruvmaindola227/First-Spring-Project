package com.example.demo.controller;

public class Student {
    private String name;
    private int rollNo;
    private String college;
    private int age;

    public Student(){}

    public Student(String name, int rollNo, String college, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.college = college;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
