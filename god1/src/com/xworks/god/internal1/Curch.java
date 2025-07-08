package com.xworks.god.internal1;

public class Curch {
    public Curch() {
        System.out.println("Curch: constructor called");
    }

    public static void readBook() {
        System.out.println("Curch: public read book method");
    }

    void pray() {
        System.out.println("Curch: package-default pray method");
    }

    private void hiddenRoom() {
        System.out.println("Curch: private hiddenRoom method");
    }
}
