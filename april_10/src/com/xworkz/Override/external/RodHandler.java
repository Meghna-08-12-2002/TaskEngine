package com.xworkz.Override.external;

import com.xworkz.Override.internal.IronRod;
import com.xworkz.Override.internal.Rod;

public class RodHandler {
    public RodHandler() {
        System.out.println("No argument constructor in RodHandler");
    }

    public void handle(Rod rod) {
        if (rod != null) {
            rod.support();
            if (rod instanceof IronRod) {
                IronRod ironRod = (IronRod) rod;
                ironRod.weld();
            } else {
                System.out.println("Handling a basic rod");
            }
        } else {
            System.out.println("No rod to handle");
        }
    }
}
