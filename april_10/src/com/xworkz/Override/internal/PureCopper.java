package com.xworkz.Override.internal;

public class PureCopper extends Copper {
    public PureCopper() {
        System.out.println("No argument constructor in PureCopper");
    }

    @Override
    public void conductivity() {
        System.out.println("Pure Copper has excellent electrical conductivity");
    }

    public void polish(Copper copper) {
        if (copper != null) {
            System.out.println("Polishing the pure copper");
        } else {
            System.out.println("Copper is null, cannot polish");
        }
    }
}
