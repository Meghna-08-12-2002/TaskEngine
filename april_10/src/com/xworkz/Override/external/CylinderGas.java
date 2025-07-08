package com.xworkz.Override.external;

import com.xworkz.Override.internal.Cylinder;
import com.xworkz.Override.internal.HollowCylinder;

public class CylinderGas {
    public CylinderGas() {
        System.out.println("No argument constructor in CylinderCare");
    }

    public void handleCylinder(Cylinder cylinder) {
        if (cylinder != null) {
            cylinder.rotate(); // Calls overridden rotate method if it's a HollowCylinder
            if (cylinder instanceof HollowCylinder) {
                HollowCylinder hollow = (HollowCylinder) cylinder; // Downcasting
                hollow.inspect(); // Invoking subclass-specific method
            } else {
                System.err.println("Cylinder is not a HollowCylinder.");
            }
        } else {
            System.err.println("Cylinder is null.");
        }
    }
}
