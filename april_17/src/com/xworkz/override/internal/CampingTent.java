package com.xworkz.override.internal;

public class CampingTent {
    private String material;
    private int capacity;
    public CampingTent(String material, int capacity){
        this.material=material;
        this.capacity=capacity;
    }
    public void setUp(){
        System.out.println("Camping tent made of "+material+" set up with capacity of "+capacity+" people");
    }
    @Override
    public String toString(){
        return "CampingTent{material='"+material+"', capacity="+capacity+"}";
    }
}
