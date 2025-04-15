package com.xworkz.Override.internal;

public class Medical extends Alovera{
    public Medical() {
        System.out.println("no argument constructor in MedicinalAlovera");
    }

    @Override
    public void apply()
    {
        System.out.println("Applying medicinal alovera gel");
    }

    public void heal() {

            System.out.println("Heal the skin using alovera gel");

    }
}
