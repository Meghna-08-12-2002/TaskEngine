package com.xworkz.Override.internal;

public class AdvancedRoute extends Route {
    public AdvancedRoute() {
        System.out.println("No argument constructor in AdvancedRoute");
    }

    @Override
    public void planRoute() {
        System.out.println("Planning an advanced route with real-time traffic updates");
    }

    public void addScenicRoute() {
        System.out.println("Adding scenic routes to the plan");
    }
}
