package com.xworkz.Override.internal;

public class FlavoredCurd extends Curd {
    public FlavoredCurd() {
        System.out.println("No argument constructor in FlavoredCurd");
    }

    @Override
    public void eat() {
        System.out.println("Eating flavored curd");
    }

    public void chill(Curd curd) {
        if (curd != null) {
            System.out.println("Chilling the curd before serving");
        } else {
            System.out.println("Curd is null, cannot chill");
        }
    }
}
