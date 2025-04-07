package com.xworks.god.external;

import com.xworks.god.internal.Temple;

public class Donation {
    public Donation() {
        System.out.println("DonationBox constructor called");
    }

    public static void accessTemplePublicMethod() {
        Temple temple = new Temple();
        temple.openGate();
    }
}
