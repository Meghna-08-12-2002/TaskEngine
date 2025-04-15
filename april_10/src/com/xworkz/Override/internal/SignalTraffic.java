package com.xworkz.Override.internal;

public class SignalTraffic extends Traffic {
    public SignalTraffic() {
        System.out.println("No argument constructor in SignalTraffic");
    }

    @Override
    public void control() {
        System.out.println("Controlling traffic using signals");
    }

    public void monitor() {
            System.out.println("Monitoring traffic flow");

    }
}
