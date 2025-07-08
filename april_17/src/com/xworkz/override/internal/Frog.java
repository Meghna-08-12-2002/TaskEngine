package com.xworkz.override.internal;

public class Frog
{
    private String name;
    private int size;

    public Frog(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " frog with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Frog{name='" + name + "', size=" + size + "}";
    }
}
