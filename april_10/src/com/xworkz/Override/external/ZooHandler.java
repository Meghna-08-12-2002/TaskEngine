package com.xworkz.Override.external;

import com.xworkz.Override.internal.SafariZoo;
import com.xworkz.Override.internal.Zoo;

public class ZooHandler {
    public ZooHandler() {
        System.out.println("No argument constructor in ZooHandler");
    }

    public void manageZoo(Zoo zoo) {
        if (zoo != null) {
            zoo.exhibitAnimals();
            if (zoo instanceof SafariZoo) {
                SafariZoo safari = (SafariZoo) zoo;
                safari.safariRide();
            } else {
                System.out.println("This is a regular zoo");
            }
        } else {
            System.out.println("Zoo is null");
        }
    }
}
