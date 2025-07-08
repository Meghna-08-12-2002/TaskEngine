package com.xworkz.java.external;

import com.xworkz.java.internal.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {

        System.out.println("Sending email notification");
    }

}
