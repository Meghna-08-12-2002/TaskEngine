package com.xworkz.override.internal;

public class Cauldron {
    private String material;
    private int capacity;
    public Cauldron(String material, int capacity){
        this.material=material;
        this.capacity=capacity;
    }
    public void heat(){
        System.out.println("The " + material + " cauldron with a capacity of " + capacity + " liters is heating up.");
    }
    @Override
    public String toString(){
        return "Cauldron{material='" + material + "', capacity=" + capacity + "}";
    }
}
