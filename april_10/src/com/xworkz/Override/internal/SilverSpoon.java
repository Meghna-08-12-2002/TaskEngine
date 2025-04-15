package com.xworkz.Override.internal;

public class SilverSpoon extends Spoon {
    public SilverSpoon() {
        System.out.println("No argument constructor in SilverSpoon");
    }

    @Override
    public void scoop() {
        System.out.println("Scooping with a polished silver spoon");
    }

    public void shine() {
            System.out.println("Shining the silver spoon");

    }
}
