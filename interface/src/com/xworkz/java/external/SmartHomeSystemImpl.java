package com.xworkz.java.external;

import com.xworkz.java.internal.SmartHomeSystem;

public class SmartHomeSystemImpl implements SmartHomeSystem {
    public void turnOnLights() {
        System.out.println("SmartHomeSystemImpl: turnOnLights");
    }
    public void turnOffLights() {
        System.out.println("SmartHomeSystemImpl: turnOffLights");
    }
    public void setThermostat() {
        System.out.println("SmartHomeSystemImpl: setThermostat");
    }
    public void lockDoors() {
        System.out.println("SmartHomeSystemImpl: lockDoors");
    }
    public void unlockDoors() {
        System.out.println("SmartHomeSystemImpl: unlockDoors");
    }
    public void playMusic() {
        System.out.println("SmartHomeSystemImpl: playMusic");
    }
    public void stopMusic() {
        System.out.println("SmartHomeSystemImpl: stopMusic");
    }
}
