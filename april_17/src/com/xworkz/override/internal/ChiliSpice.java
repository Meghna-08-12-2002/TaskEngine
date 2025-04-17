package com.xworkz.override.internal;

public class ChiliSpice {
    private String origin;
    private int heatLevel;
    public ChiliSpice(String origin, int heatLevel){
        this.origin=origin;
        this.heatLevel=heatLevel;
    }
    public void addSpice(){
        System.out.println("Adding " + origin + " chili spice with heat level " + heatLevel + " to the dish.");
    }
    @Override
    public String toString(){
        return "ChiliSpice{origin='" + origin + "', heatLevel=" + heatLevel + "}";
    }
}
