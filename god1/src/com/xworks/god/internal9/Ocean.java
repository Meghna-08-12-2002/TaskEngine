package com.xworks.god.internal9;

public class Ocean {
    public Ocean() {
        System.out.println("Ocean constructor called");
    }

    public static void wave() {
        Shell shell = new Shell();
        Shell.protect();
        shell.crack();
    }
}
