package com.xworkz.Override.internal;

public class PotatoMasher extends Masher {
    public PotatoMasher() {
        System.out.println("No argument constructor in PotatoMasher");
    }

    @Override
    public void mash() {
        System.out.println("Mashing potatoes with the potato masher");
    }

    public void mashWithStyle() {

        System.out.println("Mashing potatoes with style using the potato masher");
    }

}
