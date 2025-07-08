package com.xworkz.Override.internal;

public class Tree extends Root {
    public Tree() {
        System.out.println("No argument constructor in Tree");
    }

    @Override
    public void grow() {
        System.out.println("Tree is growing tall");
    }

    public void shade() {

            System.out.println("Tree provides shade to the root");

    }

}
