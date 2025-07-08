package com.xworkz.Override.internal;

public class StiffNeck extends Neck{
    public StiffNeck() {
        System.out.println("No argument constructor in StiffNeck");
    }

    @Override
    public void bend() {
        System.out.println("Trying to bend the stiff neck");
    }

    public void massage() {

            System.out.println("Massaging the neck");

    }
}
