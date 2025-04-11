package com.xworkz.casting.internal;

public class Inverter extends Generator{
    public Inverter(){
        System.out.println("no-arg constructor of inverter");
    }
    @Override
    public void Generate(){
        System.out.println("running generate in inverterr");
    }
    public void backup(){
        System.out.println("running backup in inverter");
    }

}
