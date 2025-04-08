package com.xworks.god.internal10;

public class Tree {
    public Tree() {
    System.out.println("Tree constructor called");
}

    public static void branch() {
        Forest forest = new Forest();
        Forest.grow();
        forest.rustle();
    }
}
