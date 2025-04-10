package com.xworkz.Override.internal;

public class FancySticker extends Sticker {
    public FancySticker() {
        System.out.println("no argument constructor in FancySticker");
    }

    @Override
    public void stick() {
        System.out.println("Sticking a fancy sticker");
    }

    public void reposition(Sticker sticker) {
        if (sticker != null) {
            System.out.println("Repositioning the sticker correctly");
        } else {
            System.out.println("No sticker to reposition");
        }
    }

}
