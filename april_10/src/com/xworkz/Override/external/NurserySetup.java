package com.xworkz.Override.external;

import com.xworkz.Override.internal.Cradle;
import com.xworkz.Override.internal.WoodenCradle;

public class NurserySetup {
    public NurserySetup() {
        System.out.println("No argument constructor in NurserySetup");
    }

    public void arrangeCradle(Cradle cradle) {
        if (cradle != null) {
            cradle.rock();
            if (cradle instanceof WoodenCradle) {
                WoodenCradle wooden = (WoodenCradle) cradle;
                wooden.paint();
            } else {
                System.out.println("Not a wooden cradle");
            }
        } else {
            System.out.println("Cradle is null");
        }
    }
}
