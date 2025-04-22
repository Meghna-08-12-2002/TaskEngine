package com.workz.java;

public abstract class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
        void show() {
            System.out.println("Name: " + name);
        }

    }
