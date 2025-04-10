package com.xworkz.Override.internal;

public class StainlessSteel extends Steel {
    public StainlessSteel() {
        System.out.println("No argument constructor in StainlessSteel");
    }

    @Override
    public void strength() {
        System.out.println("Stainless Steel is resistant to corrosion and highly durable");
    }

    public void polish(Steel steel) {
        if (steel != null) {
            System.out.println("Polishing the stainless steel surface");
        } else {
            System.out.println("Steel is null, cannot polish");
        }
    }
}
