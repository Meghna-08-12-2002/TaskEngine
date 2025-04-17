package com.xworkz.override.external;

public class Platter {
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
        return "Platter{name='" + name + "', size='" + size + "'}";
    }
}
