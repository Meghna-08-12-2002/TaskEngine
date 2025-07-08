package com.xworkz.Override.external;

import com.xworkz.Override.internal.Cardamom;
import com.xworkz.Override.internal.GreenCardamom;

public class CardamomSpice {
    public CardamomSpice() {
        System.out.println("No argument constructor in CardamomHandler");
    }

    public void processCardamom(Cardamom cardamom) {
        if (cardamom != null) {
            cardamom.aroma();
            if (cardamom instanceof GreenCardamom) {
                GreenCardamom green = (GreenCardamom) cardamom;
                green.enhanceFlavor();
            } else {
                System.out.println("Not a green cardamom");
            }
        } else {
            System.out.println("Cardamom is null");
        }
    }
}
