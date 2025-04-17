package com.xworkz.override.internal;

public class Candle {
    private String color;
    private int height;
    public Candle(String color, int height){
        this.color=color;
        this.height=height;
    }
    public void burn(){
        System.out.println("The " + color + " candle of height " + height + " cm is burning");
    }
    @Override
    public String toString(){
        return "Candle{color='" + color + "', height=" + height + "}";
    }
}
