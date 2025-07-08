package com.xworkz.override.internal;

public class Campfire {
    private String woodType;
    private int size;
    public Campfire(String woodType, int size){
        this.woodType=woodType;
        this.size=size;
    }
    public void ignite(){
        System.out.println(woodType+" wood of size "+size+" ignited");
    }
    @Override
    public String toString(){
        return "Campfire{woodType='"+woodType+"', size="+size+"}";
    }
}
