package com.xworkz.override.internal;

public class Hair
{
    private String name;
    private int size;

    public Hair(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " hair with length " + size + " cm is connected.");
    }

    @Override
    public String toString() {
        return "Hair{name='" + name + "', size=" + size + "}";
    }
}
