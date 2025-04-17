package com.xworkz.override.internal;

public class Censer {
    private String material;
    private int height;
    public Censer(String material, int height){
        this.material=material;
        this.height=height;
    }
    public void burnIncense(){
        System.out.println("Burning incense in the " + material + " censer with height " + height + " cm.");
    }
    @Override
    public String toString(){
        return "Censer{material='" + material + "', height=" + height + "}";
    }
}
