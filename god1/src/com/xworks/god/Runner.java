package com.xworks.god;

import com.xworks.god.external.Donation;
import com.xworks.god.internal.Trust;

public class Runner {
    public static void main(String[] args) {
        Trust trust= new Trust();
        Trust.showTempleFeatures();

        Donation  donation= new Donation();
        Donation.accessTemplePublicMethod();
    }

}
