package com.xworkz.Override.external;

import com.xworkz.Override.internal.HeavyStepler;
import com.xworkz.Override.internal.Stepler;

public class PaperBinder {
    public PaperBinder() {
        System.out.println("No argument constructor in PaperBinder");
    }

    public void bindPapers(Stepler stepler) {
        if (stepler != null) {
            stepler.bind();
            if (stepler instanceof HeavyStepler) {
                HeavyStepler heavy = (HeavyStepler) stepler;
                heavy.reload();
            } else {
                System.out.println("Not a heavy stepler");
            }
        } else {
            System.out.println("Stepler is null");
        }
    }
}
