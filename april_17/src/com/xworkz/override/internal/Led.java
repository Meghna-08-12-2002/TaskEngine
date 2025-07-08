package com.xworkz.override.internal;

public class Led {
    private String name;
    private int size;

    public Led(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " LED with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Led{name='" + name + "', size=" + size + "}";
    }

}
