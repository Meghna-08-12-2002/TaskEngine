package com.xworkz.override.internal;

public class Handle
{
    private String name;
    private int size;

    public Handle(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " handle with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Handle{name='" + name + "', size=" + size + "}";
    }

}
