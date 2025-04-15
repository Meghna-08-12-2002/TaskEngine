package com.xworkz.Override.external;

import com.xworkz.Override.internal.Earrings;
import com.xworkz.Override.internal.StudEarrings;

public class Jeweller {
    public Jeweller() {
        System.out.println("No argument constructor in Jeweller");
    }

    public void polish(Earrings earrings) {
        if (earrings != null) {
            earrings.wear();
            if (earrings instanceof StudEarrings) {
                StudEarrings stud = (StudEarrings) earrings;
                stud.clean();
            } else {
                System.out.println("Earrings are not stud type");
            }
        } else {
            System.out.println("Earrings are null");
        }
    }
}
