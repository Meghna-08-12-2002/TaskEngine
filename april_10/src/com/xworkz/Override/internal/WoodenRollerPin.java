package com.xworkz.Override.internal;

public class WoodenRollerPin extends RollerPin {
public WoodenRollerPin() {
    System.out.println("No argument constructor in WoodenRollerPin");
}

@Override
public void roll() {
    System.out.println("Rolling dough with a wooden roller pin");
}

public void smoothen(RollerPin rollerPin) {
    if (rollerPin != null) {
        System.out.println("Smoothing dough with the wooden roller pin");
    } else {
        System.out.println("Roller pin is null, cannot smoothen dough");
    }
}
}
