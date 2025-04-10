package com.xworkz.Override.internal;

public class Medical extends Alovera{
    public Medical() {
        System.out.println("no argument constructor in MedicinalAlovera");
    }

    @Override
    public void apply() {
        System.out.println("Applying medicinal alovera gel");
    }

    public void soothe(Alovera alovera) {
        if (alovera != null) {
            System.out.println("Soothe the skin using alovera gel");
        } else {
            System.out.println("No alovera available to soothe");
        }
    }
}
