package com.xworks.encapsulation.internal6;

public class Jet {
    private String model = "F-22 Raptor";
    private int speed = 2400;
    private String manufacturer = "Lockheed Martin";
    private boolean stealth = true;
    private double weight = 19700.5;

    public Jet() {
        System.out.println("running inside Jet");
    }

    void setModel(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void setStealth(boolean stealth) {
        this.stealth = stealth;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isStealth() {
        return stealth;
    }

    public double getWeight() {
        return weight;
    }
}
