package com.xworkz.Override.external;

import com.xworkz.Override.internal.ElectricWhisk;
import com.xworkz.Override.internal.Whisk;

public class ElectricWhiskMaterial {
    public  ElectricWhiskMaterial() {

            System.out.println("No argument constructor in ElectricWhiskHandler");
        }

        public void handle(Whisk whisk) {
            if (whisk != null) {
                whisk.mix();
                if (whisk instanceof ElectricWhisk) {
                    ElectricWhisk ew = (ElectricWhisk) whisk;
                    ew.whiskWithSpeed();
                } else {
                    System.out.println("Not an electric whisk");
                }
            } else {
                System.out.println("Whisk is null");
            }
        }
}
