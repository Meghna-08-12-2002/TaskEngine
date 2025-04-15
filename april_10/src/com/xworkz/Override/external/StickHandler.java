package com.xworkz.Override.external;

import com.xworkz.Override.internal.IncenseJossStick;
import com.xworkz.Override.internal.JossStick;

public class StickHandler {
    public StickHandler() {
        System.out.println("No argument constructor in StickHandler");
    }

    public void checkItem(JossStick stick) {
        if (stick != null) {
            stick.burn();
            if (stick instanceof IncenseJossStick) {
                IncenseJossStick incense = (IncenseJossStick) stick;
                incense.fragrance();
            } else {
                System.out.println("Not an incense joss stick");
            }
        } else {
            System.out.println("Joss Stick is null");
        }
    }
}
