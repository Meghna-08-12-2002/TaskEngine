package com.xworkz.override.internal;

public class Alovera {
    private String name;
    private int quantity;

    public Alovera(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println(name + " Alovera with quantity " + quantity);
    }

    @Override
    public String toString() {
        return "Alovera{name='" + name + "', quantity=" + quantity + "}";
    }
}
