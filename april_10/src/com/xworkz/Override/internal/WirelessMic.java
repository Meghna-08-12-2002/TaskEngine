package com.xworkz.Override.internal;

public class WirelessMic extends Mic {
    public WirelessMic() {
        System.out.println("No argument constructor in WirelessMic");
    }

    @Override
    public void record() {
        System.out.println("Recording audio using wireless mic");
    }

    public void connect() {

            System.out.println("Connecting wireless mic to system");

    }
}
