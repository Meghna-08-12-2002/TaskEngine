package com.xworkz.Override.external;

import com.xworkz.Override.internal.IrrigationCanal;
import com.xworkz.Override.internal.WaterCanal;

public class CanalMonitor {
    public CanalMonitor() {
        System.out.println("No argument constructor in CanalMonitor");
    }

    public void observe(WaterCanal canal) {
        if (canal != null) {
            canal.flow();
            if (canal instanceof IrrigationCanal) {
                IrrigationCanal irrigation = (IrrigationCanal) canal;
                irrigation.clean();
            } else {
                System.out.println("Just observing general water flow");
            }
        } else {
            System.out.println("No canal to monitor");
        }
    }
}
