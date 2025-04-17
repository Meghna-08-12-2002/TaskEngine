package com.xworkz.override.internal;

public class Curd
{
    private String name;
    private int size;

    public Curd(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " curd container connected with size " + size);
    }

    @Override
    public String toString() {
        return "Curd{name='" + name + "', size=" + size + "}";
    }
}
