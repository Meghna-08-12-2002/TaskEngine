package com.xworkz.Override.external;

import com.xworkz.Override.internal.FaceMoisturizer;
import com.xworkz.Override.internal.Moisturizer;

public class MoisturizerHandler {
    public void handle(Moisturizer moisturizer) {
        if (moisturizer != null) {
            moisturizer.apply();
            if (moisturizer instanceof FaceMoisturizer) {
                FaceMoisturizer face = (FaceMoisturizer) moisturizer;
                face.hydrate();
            } else {
                System.out.println("Using basic moisturizer");
            }
        } else {
            System.out.println("No moisturizer provided");
        }
    }
}
