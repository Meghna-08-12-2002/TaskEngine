package com.xworkz.Override.internal;

public class MetalPincer extends Pincer {
    public MetalPincer() {
        System.out.println("No argument constructor in MetalPincer");
    }

    @Override
    public void grip() {
        System.out.println("Gripping with a metal pincer");
    }

    public void sharpen() {

            System.out.println("Sharpening the metal pincer");

    }

}
