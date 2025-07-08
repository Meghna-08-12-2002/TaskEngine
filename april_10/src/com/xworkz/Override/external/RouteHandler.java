package com.xworkz.Override.external;

import com.xworkz.Override.internal.AdvancedRoute;
import com.xworkz.Override.internal.Route;

public class RouteHandler {
    public RouteHandler() {
        System.out.println("No argument constructor in RouteHandler");
    }

    public void handleRoute(Route route) {
        if (route != null) {
            route.planRoute();
            if (route instanceof AdvancedRoute) {
                AdvancedRoute advanced = (AdvancedRoute) route;
                advanced.addScenicRoute();
            } else {
                System.out.println("This is a basic route");
            }
        } else {
            System.out.println("Route is null");
        }
    }
}
