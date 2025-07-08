package com.xworkz.override.internal;

public class Chandelier {
    private String style;
    private int numberOfLights;
    public Chandelier(String style, int numberOfLights){
        this.style=style;
        this.numberOfLights=numberOfLights;
    }
    public void illuminate(){
        System.out.println("The " + style + " chandelier with " + numberOfLights + " lights is illuminating the room.");
    }
    @Override
    public String toString(){
        return "Chandelier{style='" + style + "', numberOfLights=" + numberOfLights + "}";
    }
}
