package com.xworkz.override.internal;

public class Blush {
    private String color;
    private int size;
    public Blush(String color, int size){
        this.color=color;
        this.size=size;
    }
    public void apply(){
        System.out.println(color+" blush of size "+size+" applied");
    }
    @Override
    public String toString(){
        return "Blush{color='"+color+"', size="+size+"}";
    }
}
