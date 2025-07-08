package com.xworkz.Override.internal;

public class SteelFlask extends Flask {
    public SteelFlask() {
        System.out.println("No argument constructor in SteelFlask");
    }

    @Override
    public void carry() {
        System.out.println("Carrying hot liquid in a steel flask");
    }

    public void insulate() {
            System.out.println("Insulating the flask to maintain temperature");

    }

}
