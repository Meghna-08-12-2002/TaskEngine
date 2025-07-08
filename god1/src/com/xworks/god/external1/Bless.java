package com.xworks.god.external1;

import com.xworks.god.internal.Temple;
import com.xworks.god.internal1.Curch;

public class Bless {
    public Bless() {
        System.out.println("Bless constructor called");
    }

    public static void accessMethod() {
        Curch curch = new Curch();
        Curch.readBook();
    }
}
