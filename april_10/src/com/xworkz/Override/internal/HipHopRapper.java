package com.xworkz.Override.internal;

public class HipHopRapper extends Rapper {
    public HipHopRapper() {
        System.out.println("No argument constructor in HipHopRapper");
    }

    @Override
    public void perform() {
        System.out.println("HipHop rapper is performing with a unique style");
    }

    public void freestyle(Rapper rapper) {
        if (rapper != null) {
            System.out.println("Freestyle rapping with " + rapper.getClass().getSimpleName());
        } else {
            System.out.println("Rapper is null, cannot freestyle");
        }
    }
}
