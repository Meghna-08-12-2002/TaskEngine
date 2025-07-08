package com.xworks.god.extenal10;

import com.xworks.god.internal10.Forest;

public class Wildlife {
    public Wildlife() {
        System.out.println("Wildlife constructor called");
    }

    public static void explore() {
        Forest forest = new Forest();
        Forest.grow();
    }
}
