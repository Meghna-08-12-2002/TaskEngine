package com.xworkz.override.internal;

public class Eyeliner {
    private String name;
    private int size;

    public Eyeliner(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " eyeliner with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Eyeliner{name='" + name + "', size=" + size + "}";
    }
}
