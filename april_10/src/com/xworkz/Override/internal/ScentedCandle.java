package com.xworkz.Override.internal;

public class ScentedCandle extends Candle {
    public ScentedCandle() {
        System.out.println("No argument constructor in ScentedCandle");
    }

    @Override
    public void light() {
        System.out.println("Lighting a scented candle with fragrance");
    }

    public void releaseFragrance(Candle candle) {
        if (candle != null) {
            System.out.println("Scented candle is releasing fragrance");
        } else {
            System.out.println("Candle is null, cannot release fragrance");
        }
    }
}
