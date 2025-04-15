package com.xworkz.Override.external;

import com.xworkz.Override.internal.Curd;
import com.xworkz.Override.internal.FlavoredCurd;

public class CurdEnthusiast {
    public CurdEnthusiast() {
        System.out.println("No argument constructor in CurdEnthusiast");
    }

    public void enjoy(Curd curd) {
        if (curd != null) {
            curd.eat();
            if (curd instanceof FlavoredCurd) {
                FlavoredCurd flavored = (FlavoredCurd) curd;
                flavored.chill();
            } else {
                System.out.println("This is regular curd");
            }
        } else {
            System.out.println("Curd is null");
        }
    }
}
