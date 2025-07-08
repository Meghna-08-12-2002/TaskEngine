package com.xworkz.override.internal;

public class Letter {
    private String name;
    private int size;

    public Letter(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " letter with size " + size + " cm is connected.");
    }

    @Override
    public String toString() {
        return "Letter{name='" + name + "', size=" + size + "}";
    }
}
