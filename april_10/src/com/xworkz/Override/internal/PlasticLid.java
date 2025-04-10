package com.xworkz.Override.internal;

public class PlasticLid extends Lid {
    public PlasticLid() {
        System.out.println("No argument constructor in PlasticLid");
    }

    @Override
    public void cover() {
        System.out.println("Covering with a plastic lid");
    }

    public void checkFit(Lid lid) {
        if (lid != null) {
            System.out.println("Checking the fit of the plastic lid");
        } else {
            System.out.println("Lid is null, cannot check fit");
        }
    }
}
