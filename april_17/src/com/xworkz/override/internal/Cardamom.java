package com.xworkz.override.internal;

public class Cardamom {
    private String origin;
    private int weight;
    public Cardamom(String origin, int weight){
        this.origin=origin;
        this.weight=weight;
    }
    public void use(){
        System.out.println("The " + origin + " cardamom weighing " + weight + " grams is used.");
    }
    @Override
    public String toString(){
        return "Cardamom{origin='" + origin + "', weight=" + weight + "}";
    }
}
