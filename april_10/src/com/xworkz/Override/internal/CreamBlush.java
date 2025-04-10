package com.xworkz.Override.internal;

public class CreamBlush extends Blush {
    public CreamBlush() {
        System.out.println("No argument constructor in CreamBlush");
    }

    @Override
    public void apply() {
        System.out.println("Applying cream blush");
    }

    public void blend(Blush blush) {
        if (blush != null) {
            System.out.println("Blending the blush smoothly");
        } else {
            System.out.println("Blush is null, can't blend");
        }
    }
}
