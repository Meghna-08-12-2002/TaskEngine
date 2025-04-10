package com.xworkz.Override.internal;

public class SilkRug extends Rug {
    public SilkRug() {
        System.out.println("No argument constructor in SilkRug");
    }

    @Override
    public void spread() {
        System.out.println("Spreading a silk rug");
    }

    public void fold(Rug rug) {
        if (rug != null) {
            System.out.println("Folding the silk rug");
        } else {
            System.out.println("Rug is null, cannot fold");
        }
    }
}
