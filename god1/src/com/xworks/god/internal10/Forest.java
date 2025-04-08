package com.xworks.god.internal10;

public class Forest {
    public Forest() {
        System.out.println("Forest constructor called");
    }

    public static void grow() {
        System.out.println("Forest: public grow method");
    }

    void rustle() {
        System.out.println("Forest: package-default rustle method");
    }

    private void burn() {
        System.out.println("Forest: private burn method");
    }
}
