package com.xworkz.override.internal;

public class Ant {
    private String species;
    private int count;
    public Ant(String species, int count){
        this.species=species;
        this.count=count;
    }
    public void displayInfo(){
        System.out.println(species+" ant colony with count "+count);
    }
    @Override
    public String toString(){
        return "Ant{species='"+species+"', count="+count+"}";
    }
}
