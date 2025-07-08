package com.xworkz.override.internal;

public class Doll {
    private String name;
    private int size;

    public Doll(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " doll with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Doll{name='" + name + "', size=" + size + "}";
    }
}
