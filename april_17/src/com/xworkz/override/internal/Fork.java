package com.xworkz.override.internal;

public class Fork {
    private String name;
    private int size;

    public Fork(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " fork with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Fork{name='" + name + "', size=" + size + "}";
    }
}
