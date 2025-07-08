package com.xworks.god.internal6;

public class Powder {
    public Powder() {
        System.out.println("Powder constructor called");
    }

    public static void apply() {
        System.out.println("Powder: public apply method");
    }

    void blend() {
        System.out.println("Powder: package-default blend method");
    }

    private void conceal() {
        System.out.println("Powder: private conceal method");
    }
}
