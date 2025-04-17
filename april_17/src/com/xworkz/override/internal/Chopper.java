package com.xworkz.override.internal;

public class Chopper {
    private String model;
    private int bladeLength;
    public Chopper(String model, int bladeLength){
        this.model=model;
        this.bladeLength=bladeLength;
    }
    public void chop(){
        System.out.println("Chopping with " + model + " chopper having blade length " + bladeLength + " cm.");
    }
    @Override
    public String toString(){
        return "Chopper{model='" + model + "', bladeLength=" + bladeLength + "}";
    }
}
