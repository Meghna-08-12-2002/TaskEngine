package com.xworks.god.internal9;

public class Shell {
    public Shell() {
        System.out.println("Shell constructor called");
    }

    public static void protect() {
        System.out.println("Shell: public protect method");
    }

    void crack() {
        System.out.println("Shell: package-default crack method");
    }

    private void dissolve() {
        System.out.println("Shell: private dissolve method");
    }
}
