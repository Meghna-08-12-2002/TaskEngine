package com.xworkz.Override.internal;

public class StainlessSteel extends Steel {
    public StainlessSteel() {
        System.out.println("No argument constructor in StainlessSteel");
    }

    @Override
    public void strength() {
        System.out.println("Stainless Steel is resistant to corrosion and highly durable");
    }

    public void polish() {

            System.out.println("Polishing the stainless steel surface");

    }
}
