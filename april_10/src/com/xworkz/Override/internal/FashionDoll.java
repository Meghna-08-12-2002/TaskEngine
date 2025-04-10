package com.xworkz.Override.internal;

public class FashionDoll extends Doll{
    public FashionDoll() {
        System.out.println("no argument constructor in FashionDoll");
    }

    @Override
    public void show() {
        System.out.println("Showing a fashion doll");
    }

    public void accessorize(Doll doll) {
        if (doll != null) {
            System.out.println("Accessorizing doll with style");
        } else {
            System.out.println("Cannot accessorize, doll is missing");
        }
    }
}
