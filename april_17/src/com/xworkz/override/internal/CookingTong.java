package com.xworkz.override.internal;

public class CookingTong {
    private String name;
    private int size;

    public CookingTong(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " tong connected with size " + size);
    }

    @Override
    public String toString() {
        return "CookingTong{name='" + name + "', size=" + size + "}";
    }
}
