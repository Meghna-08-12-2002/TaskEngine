package com.xworkz.Override.external;

import com.xworkz.Override.internal.Ant;
import com.xworkz.Override.internal.WorkerAnt;

public class AntHandler {
    public AntHandler() {
        System.out.println("No argument constructor in AntHandler");
    }

    public void manageAnt(Ant ant) {
        if (ant != null) {
            ant.work();
            if (ant instanceof WorkerAnt) {
                WorkerAnt worker = (WorkerAnt) ant;
                worker.dig();
            } else {
                System.out.println("This is a general ant");
            }
        } else {
            System.out.println("Ant is null");
        }
    }
}
