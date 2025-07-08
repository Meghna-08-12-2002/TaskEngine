package com.xworkz.override.internal;

public class Clock {
    private String name;
    private int size;

    public Clock(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " clock connected with size " + size);
    }

    @Override
    public String toString() {
        return "Clock{name='" + name + "', size=" + size + "}";
    }
}
