package com.xworkz.override.internal;

public class Garden {
    private String name;
    private int size;

    public Garden(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " garden with area " + size + " sq meters is connected.");
    }

    @Override
    public String toString() {
        return "Garden{name='" + name + "', size=" + size + "}";
    }
}
