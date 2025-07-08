package com.xworkz.override.internal;

public class Circle {
    private String name;
    private int size;

    public Circle(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " circle connected with size " + size);
    }

    @Override
    public String toString() {
        return "Circle{name='" + name + "', size=" + size + "}";
    }

}
