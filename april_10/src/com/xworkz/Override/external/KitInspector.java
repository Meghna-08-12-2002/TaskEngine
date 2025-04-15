package com.xworkz.Override.external;

import com.xworkz.Override.internal.FirstAidKit;
import com.xworkz.Override.internal.Kit;

public class KitInspector {
    public KitInspector() {
        System.out.println("No argument constructor in KitInspector");
    }

    public void inspect(Kit kit) {
        if (kit != null) {
            kit.open();
            if (kit instanceof FirstAidKit) {
                FirstAidKit aid = (FirstAidKit) kit;
                aid.sanitize();
            } else {
                System.out.println("Regular kit being inspected");
            }
        } else {
            System.out.println("No kit to inspect");
        }
    }
}
