package com.xworkz.Override.internal;

public class MatteLipstick extends Lipstick {
    public MatteLipstick() {
        System.out.println("No argument constructor in MatteLipstick");
    }

    @Override
    public void apply() {
        System.out.println("Applying matte lipstick");
    }

    public void longLasting() {

            System.out.println("This lipstick lasts all day");

    }
}
