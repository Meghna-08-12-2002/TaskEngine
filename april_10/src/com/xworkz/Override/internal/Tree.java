package com.xworkz.Override.internal;

public class Tree extends Root {
    public Tree() {
        System.out.println("No argument constructor in Tree");
    }

    @Override
    public void grow() {
        System.out.println("Tree is growing tall");
    }

    public void shade(Root root) {
        if (root != null) {
            System.out.println("Tree provides shade to the root");
        } else {
            System.out.println("Root is null, cannot provide shade");
        }
    }

}
