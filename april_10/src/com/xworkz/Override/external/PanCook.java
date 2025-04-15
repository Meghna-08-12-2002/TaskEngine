package com.xworkz.Override.external;

import com.xworkz.Override.internal.FryingPan;
import com.xworkz.Override.internal.Pan;

public class PanCook {

        public PanCook() {
            System.out.println("No argument constructor in PanHandler");
        }

        public void cook(Pan pan) {
            if (pan != null) {
                pan.cook();
                if (pan instanceof FryingPan) {
                    FryingPan fryingPan = (FryingPan) pan;
                    fryingPan.fry();
                } else {
                    System.out.println("Not a frying pan");
                }
            } else {
                System.out.println("Pan is null");
            }
        }
    }
