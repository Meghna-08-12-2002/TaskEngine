package com.xworkz.Override.external;

import com.xworkz.Override.internal.SignalTraffic;
import com.xworkz.Override.internal.Traffic;

public class TrafficPolice {
    public TrafficPolice() {
        System.out.println("No argument constructor in TrafficPolice");
    }

    public void manage(Traffic traffic) {
        if (traffic != null) {
            traffic.control();
            if (traffic instanceof SignalTraffic) {
                SignalTraffic signal = (SignalTraffic) traffic;
                signal.monitor();
            } else {
                System.out.println("Manual traffic control in action");
            }
        } else {
            System.out.println("No traffic to manage");
        }
    }
}
