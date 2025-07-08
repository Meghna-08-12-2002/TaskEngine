package com.xworkz.Override.external;

import com.xworkz.Override.internal.GrilledSandSwitch;
import com.xworkz.Override.internal.SandSwitch;

public class ServiceSandwitch {
    public ServiceSandwitch() {
        System.out.println("no argument constructor of SeverSandwitch");
    }
        public void serve(SandSwitch sandwich) {
            if (sandwich != null) {
                sandwich.serve();

                if (sandwich instanceof GrilledSandSwitch) {
                    GrilledSandSwitch grilled = (GrilledSandSwitch) sandwich;
                    grilled.toast();
                } else {
                    System.out.println("Regular sandwich, no toasting required");
                }
            } else {
                System.err.println("Sandwich is null");
            }
    }

}
