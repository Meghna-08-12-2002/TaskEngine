package com.xworkz.Override.external;

import com.xworkz.Override.internal.Flask;
import com.xworkz.Override.internal.SteelFlask;

public class FlaskManager {
    public FlaskManager() {
        System.out.println("No argument constructor in FlaskManager");
    }

    public void manageFlask(Flask flask) {
        if (flask != null) {
            flask.carry();
            if (flask instanceof SteelFlask) {
                SteelFlask steelFlask = (SteelFlask) flask;
                steelFlask.insulate();
            } else {
                System.out.println("This is not a steel flask.");
            }
        } else {
            System.out.println("No flask to carry.");
        }
    }
}
