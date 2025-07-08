package com.xworkz.override.internal;

public class Adopter {
    private String name;
    private int size;

    public Adopter(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " adapter connected with size " + size);
    }

    @Override
    public String toString() {
        return "Adopter{name='" + name + "', size=" + size + "}";
    }
}
