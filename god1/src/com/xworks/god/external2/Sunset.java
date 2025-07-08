package com.xworks.god.external2;

import com.xworks.god.internal.Temple;
import com.xworks.god.internal2.Beach;

public class Sunset {
    public Sunset() {
        System.out.println("Sunset constructor called");
    }

    public static void access() {
        Beach beach = new Beach();
        Beach.prepareGear();
    }
}
