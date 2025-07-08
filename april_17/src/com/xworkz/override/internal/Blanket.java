package com.xworkz.override.internal;

public class Blanket {
    private String color;
    private int size;
    public Blanket(String color, int size){
        this.color=color;
        this.size=size;
    }
    public void spread(){
        System.out.println(color+" blanket of size "+size+" spread");
    }
    @Override
    public String toString(){
        return "Blanket{color='"+color+"', size="+size+"}";
    }
}
