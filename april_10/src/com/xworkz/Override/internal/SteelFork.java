package com.xworkz.Override.internal;

public class SteelFork extends Fork {
    public SteelFork() {
        System.out.println("No argument constructor in SteelFork");
    }

    @Override
    public void pick() {
        System.out.println("Picking food with a durable steel fork");
    }

    public void polish(Fork fork) {
        if (fork != null) {
            System.out.println("Polishing the steel fork");
        } else {
            System.out.println("Fork is null, cannot polish");
        }
    }
}
