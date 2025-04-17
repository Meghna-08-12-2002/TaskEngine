package com.xworkz.override.internal;

public class Jar
{
    private String name;
    private int size;

    public Jar(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " jar with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Jar{name='" + name + "', size=" + size + "}";
    }
}
