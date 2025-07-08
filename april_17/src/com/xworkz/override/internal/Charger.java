package com.xworkz.override.internal;

public class Charger {
    private String brand;
    private int powerOutput;
    public Charger(String brand, int powerOutput){
        this.brand=brand;
        this.powerOutput=powerOutput;
    }
    public void chargeDevice(){
        System.out.println("Charging device using " + brand + " charger with power output of " + powerOutput + "W.");
    }
    @Override
    public String toString(){
        return "Charger{brand='" + brand + "', powerOutput=" + powerOutput + "}";
    }
}
