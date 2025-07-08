package com.xworkz.override.internal;

public class Copper {
    private String name;
    private int size;

    public Copper(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " copper connected with size " + size);
    }

    @Override
    public String toString() {
        return "Copper{name='" + name + "', size=" + size + "}";
    }
}
