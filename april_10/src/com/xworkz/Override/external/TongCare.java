package com.xworkz.Override.external;

import com.xworkz.Override.internal.CookingTong;
import com.xworkz.Override.internal.Tong;

public class TongCare {
    public TongCare() {
        System.out.println("No argument constructor in TongCare");
    }

    public void handleTong(Tong tong) {
        if (tong != null) {
            tong.grip(); // Calls overridden method if CookingTong
            if (tong instanceof CookingTong) {
                CookingTong cooking = (CookingTong) tong; // Downcasting
                cooking.clean(); // Subclass-specific method
            } else {
                System.err.println("Tong is not a CookingTong.");
            }
        } else {
            System.err.println("Tong is null.");
        }
    }
}
