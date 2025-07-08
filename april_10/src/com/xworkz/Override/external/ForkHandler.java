package com.xworkz.Override.external;

import com.xworkz.Override.internal.Fork;
import com.xworkz.Override.internal.SteelFork;

public class ForkHandler {
    public ForkHandler() {
        System.out.println("No argument constructor in ForkHandler");
    }

    public void handle(Fork fork) {
        if (fork != null) {
            fork.pick();
            if (fork instanceof SteelFork) {
                SteelFork steelFork = (SteelFork) fork;
                steelFork.polish();
            } else {
                System.out.println("Picking food with a basic fork");
            }
        } else {
            System.out.println("No fork to handle");
        }
    }
}
