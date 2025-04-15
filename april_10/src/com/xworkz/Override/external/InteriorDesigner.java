package com.xworkz.Override.external;

import com.xworkz.Override.internal.Candle;
import com.xworkz.Override.internal.ScentedCandle;

public class InteriorDesigner {
    public InteriorDesigner() {
        System.out.println("No argument constructor in InteriorDesigner");
    }

    public void decorate(Candle candle) {
        if (candle != null) {
            candle.light();
            if (candle instanceof ScentedCandle) {
                ScentedCandle scented = (ScentedCandle) candle;
                scented.releaseFragrance();
            } else {
                System.out.println("Using unscented candle for decoration");
            }
        } else {
            System.out.println("No candle provided for decoration");
        }
    }
}
