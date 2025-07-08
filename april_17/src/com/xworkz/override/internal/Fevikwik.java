package com.xworkz.override.internal;

public class Fevikwik {
    private String name;
    private int size;

    public Fevikwik(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " Fevikwik with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Fevikwik{name='" + name + "', size=" + size + "}";
    }
}
