package com.xworkz.Override.internal;

public class SignalTraffic extends Traffic {
    public SignalTraffic() {
        System.out.println("No argument constructor in SignalTraffic");
    }

    @Override
    public void control() {
        System.out.println("Controlling traffic using signals");
    }

    public void monitor(Traffic traffic) {
        if (traffic != null) {
            System.out.println("Monitoring traffic flow");
        } else {
            System.out.println("No traffic object provided to monitor");
        }
    }
}
