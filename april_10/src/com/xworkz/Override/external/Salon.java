package com.xworkz.Override.external;

import com.xworkz.Override.internal.ManicureNail;
import com.xworkz.Override.internal.Nail;

public class Salon {
    public void beautify(Nail nail) {
        if (nail != null) {
            nail.file();
            if (nail instanceof ManicureNail) {
                ManicureNail manicure = (ManicureNail) nail;
                manicure.polish();
            } else {
                System.out.println("Not a manicure nail");
            }
        } else {
            System.out.println("Nail is null");
        }
    }
}
