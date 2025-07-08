package com.xworks.god.internal;

public class Temple {
    public Temple() {
        System.out.println("Temple constructor called");
    }

    public void openGate() {
        System.out.println("Temple: public openGate method");
    }

    void attendPooja() {
        System.out.println("Temple: package-default attendPooja method");
    }

    private void secretChamber() {
        System.out.println("Temple: private secretChamber method");
    }
}
