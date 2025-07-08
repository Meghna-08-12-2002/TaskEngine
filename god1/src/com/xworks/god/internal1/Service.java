package com.xworks.god.internal1;

public class Service {
    public Service() {
        System.out.println("Service contructor called");
    }

    public static void showFeatures() {
        Curch curch = new Curch();
        curch.readBook();
        curch.pray();
    }
}
