package com.xworkz.Override.internal;

public class TreeFrog extends Frog {
    public TreeFrog() {
        System.out.println("No argument constructor in TreeFrog");
    }

    @Override
    public void jump() {
        System.out.println("Tree frog is jumping from tree to tree");
    }

    public void croak(Frog frog) {
        if (frog != null) {
            System.out.println("Tree frog is croaking");
        } else {
            System.out.println("Frog is null, cannot croak");
        }
    }
}
