package com.xworkz.Override.internal;

public class ScentedCandle extends Candle {
    public ScentedCandle() {
        System.out.println("No argument constructor in ScentedCandle");
    }

    @Override
    public void light() {
        System.out.println("Lighting a scented candle with fragrance");
    }

    public void releaseFragrance() {

            System.out.println("Scented candle is releasing fragrance");

    }
}
