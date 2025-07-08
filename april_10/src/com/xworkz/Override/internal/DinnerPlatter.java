package com.xworkz.Override.internal;

public class DinnerPlatter extends Platter {
    public DinnerPlatter() {
        System.out.println("No argument constructor in DinnerPlatter");
    }

    @Override
    public void serve() {
        System.out.println("Serving food on a dinner platter");
    }

    public void arrange() {

            System.out.println("Arranging food on the platter");

    }
}
