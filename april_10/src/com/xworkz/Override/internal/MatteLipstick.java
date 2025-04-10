package com.xworkz.Override.internal;

public class MatteLipstick extends Lipstick {
    public MatteLipstick() {
        System.out.println("No argument constructor in MatteLipstick");
    }

    @Override
    public void apply() {
        System.out.println("Applying matte lipstick");
    }

    public void longLasting(Lipstick lipstick) {
        if (lipstick != null) {
            System.out.println("This lipstick lasts all day");
        } else {
            System.out.println("Lipstick is null, can't check longevity");
        }
    }
}
