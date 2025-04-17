package com.xworkz.override.internal;

public class Fire {
    private String name;
    private int size;

    public Fire(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " fire with intensity " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Fire{name='" + name + "', size=" + size + "}";
    }
}
