package com.xworkz.Override.internal;

public class CurcuminTurmeric extends Turmeric {
    public CurcuminTurmeric() {
        System.out.println("No argument constructor in CurcuminTurmeric");
    }

    @Override
    public void flavor() {
        System.out.println("Adding flavor with curcumin turmeric");
    }

    public void boostHealth() {

            System.out.println("Boosting health with curcumin turmeric");

    }
}
