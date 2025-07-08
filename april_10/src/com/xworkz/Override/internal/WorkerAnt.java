package com.xworkz.Override.internal;

public class WorkerAnt extends Ant {
    public WorkerAnt() {
        System.out.println("No argument constructor in WorkerAnt");
    }

    @Override
    public void work() {
        System.out.println("Worker ant is gathering food");
    }

    public void dig() {
        System.out.println("Worker ant is digging a tunnel");
    }
}
