package com.xworkz.Override.external;

import com.xworkz.Override.internal.Neck;
import com.xworkz.Override.internal.StiffNeck;

public class NeckTherapist {
    public NeckTherapist() {
        System.out.println("No argument constructor in NeckTherapist");
    }

    public void treat(Neck neck) {
        if (neck != null) {
            neck.bend();
            if (neck instanceof StiffNeck) {
                StiffNeck stiff = (StiffNeck) neck;
                stiff.massage();
            } else {
                System.out.println("Neck is normal, no massage needed");
            }
        } else {
            System.out.println("Neck is null");
        }
    }
}
