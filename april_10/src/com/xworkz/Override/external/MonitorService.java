package com.xworkz.Override.external;

import com.xworkz.Override.internal.LedMonitor;
import com.xworkz.Override.internal.Monitor;

public class MonitorService {
    public MonitorService() {
        System.out.println("No argument constructor in MonitorService");
    }

    public void showMonitorDetails(Monitor monitor) {
        if (monitor != null) {
            monitor.display();

            if (monitor instanceof LedMonitor) {
                LedMonitor ledMonitor = (LedMonitor) monitor;
                ledMonitor.adjustBrightness();
            } else {
                System.out.println("No brightness adjustment available for this monitor.");
            }
        } else {
            System.out.println("Monitor is null");
        }
    }
}
