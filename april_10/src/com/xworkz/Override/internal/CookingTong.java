package com.xworkz.Override.internal;

public class CookingTong extends Tong {
    public CookingTong() {
        System.out.println("No argument constructor in CookingTong");
    }

    @Override
    public void grip() {
        System.out.println("Gripping with a cooking tong");
    }

    public void clean() {

            System.out.println("Cleaning the cooking tong");

    }
}
