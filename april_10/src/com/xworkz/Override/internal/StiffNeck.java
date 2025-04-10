package com.xworkz.Override.internal;

public class StiffNeck extends Neck{
    public StiffNeck() {
        System.out.println("No argument constructor in StiffNeck");
    }

    @Override
    public void bend() {
        System.out.println("Trying to bend the stiff neck");
    }

    public void massage(Neck neck) {
        if (neck != null) {
            System.out.println("Massaging the neck");
        } else {
            System.out.println("Neck is null, can't massage");
        }
    }
}
