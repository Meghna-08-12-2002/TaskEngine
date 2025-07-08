package com.xworks.god.internal5;

public class Comb {
    public Comb() {
        System.out.println("Comb constructor called");
    }

    public static void clean() {
        System.out.println("Comb: public clean method");
    }

    void untangle() {
        System.out.println("Comb: package-default untangle method");
    }

    private void hide() {
        System.out.println("Comb: private hide method");
    }
}
