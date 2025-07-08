package com.xworkz.java.external;

import com.xworkz.java.internal.Transport;

public class TrainTransport implements Transport {
    @Override
    public void move() {
        System.out.println("Traveling by Train");

    }
}
