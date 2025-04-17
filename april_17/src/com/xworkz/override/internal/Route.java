package com.xworkz.override.internal;

public class Route {
    private String routeName;
    private double distance;
    public Route(String routeName, double distance) {
        this.routeName = routeName;
        this.distance = distance;
    }
    public void displayRouteInfo() {
        System.out.println("Route " + routeName + " with a distance of " + distance + " km.");
    }
    @Override
    public String toString() {
        return "Route{routeName='" + routeName + "', distance=" + distance + " km}";
    }
}
