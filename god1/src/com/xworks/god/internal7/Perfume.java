package com.xworks.god.internal7;

public class Perfume {
    public Perfume() {
        System.out.println("Perfume constructor called");
    }

    public static void spray() {
        System.out.println("Perfume: public spray method");
    }

    void refresh() {
        System.out.println("Perfume: package-default refresh method");
    }

    private void evaporate() {
        System.out.println("Perfume: private evaporate method");
    }
}
