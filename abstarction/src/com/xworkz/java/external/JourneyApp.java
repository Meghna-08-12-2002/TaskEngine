package com.xworkz.java.external;

import com.xworkz.java.internal.Transport;

public class JourneyApp {
    private Transport transport;
    public JourneyApp(Transport transport) {
        this.transport = transport;
    }
    public void beginJourney() {
        System.out.println("Journey begins in JourneyApp");
        if (transport != null) {
            transport.move();
        } else {
            System.out.println("Transport is null");
        }
    }
}
