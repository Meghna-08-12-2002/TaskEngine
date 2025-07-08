package com.xworkz.override.internal;

public class Finger {
    private String name;
    private int size;

    public Finger(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " finger with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Finger{name='" + name + "', size=" + size + "}";
    }

}
