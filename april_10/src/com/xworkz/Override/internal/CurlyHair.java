package com.xworkz.Override.internal;

public class CurlyHair extends Hair {
    public CurlyHair() {
        System.out.println("No argument constructor in CurlyHair");
    }

    @Override
    public void style() {
        System.out.println("Styling curly hair with extra care");
    }

    public void moisturize() {

            System.out.println("Applying moisturizer for curly hair");

    }
}
