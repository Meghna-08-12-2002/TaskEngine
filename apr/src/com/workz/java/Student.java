package com.workz.java;

public class Student extends Person{
    int roll;
    Student(String name, int roll) {
        super(name);
        this.roll = roll;
    }
    void display() {
        System.out.println("Roll: " + roll);
    }

}
