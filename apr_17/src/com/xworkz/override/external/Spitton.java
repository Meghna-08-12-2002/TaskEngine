package com.xworkz.override.external;

public class Spitton {
    private String name;
    private String size;

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Spitton{name='" + name + "', size='" + size + "'}";
    }
}
