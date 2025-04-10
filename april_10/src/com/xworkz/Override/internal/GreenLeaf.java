package com.xworkz.Override.internal;

public class GreenLeaf extends Leaf {
    public GreenLeaf() {
        System.out.println("No argument constructor in GreenLeaf");
    }

    @Override
    public void fall() {
        System.out.println("Green leaf gently falls to the ground");
    }

    public void photosynthesis(Leaf leaf) {
        if (leaf != null) {
            System.out.println("Green leaf is performing photosynthesis");
        } else {
            System.out.println("Leaf is null, cannot perform photosynthesis");
        }
    }
}
