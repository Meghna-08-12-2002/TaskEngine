package com.xworkz.java.external;

import com.xworkz.java.internal.Notification;

public class AlertApp {
    private Notification notification;
    public AlertApp(Notification notification) {
        this.notification = notification;
    }
    public void alert() {
        System.out.println("Triggering alert in AlertApp");
        if (notification != null) {
            notification.notifyUser();
        } else {
            System.out.println("Notification is null");
        }
    }
}
