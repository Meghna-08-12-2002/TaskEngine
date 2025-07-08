package com.xworkz.java.external;

import com.xworkz.java.internal.Notification;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending SMS notification");
    }
}
