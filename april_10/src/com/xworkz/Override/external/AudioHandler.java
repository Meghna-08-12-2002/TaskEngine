package com.xworkz.Override.external;

import com.xworkz.Override.internal.Mic;
import com.xworkz.Override.internal.WirelessMic;

public class AudioHandler {
    public AudioHandler() {
        System.out.println("No argument constructor in AudioHandler");
    }

    public void handleMic(Mic mic) {
        if (mic != null) {
            mic.record();
            if (mic instanceof WirelessMic) {
                WirelessMic wireless = (WirelessMic) mic;
                wireless.connect();
            } else {
                System.out.println("Not a wireless mic");
            }
        } else {
            System.out.println("Mic is null");
        }
    }
}
