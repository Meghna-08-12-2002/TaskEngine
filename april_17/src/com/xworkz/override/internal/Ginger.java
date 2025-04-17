package com.xworkz.override.internal;

public class Ginger {
    private String name;
    private int size;

    public Ginger(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " ginger with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Ginger{name='" + name + "', size=" + size + "}";
    }
}
