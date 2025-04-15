package com.xworkz.Override.internal;

public class IncenseJossStick extends JossStick {
    public IncenseJossStick() {
        System.out.println("No argument constructor in IncenseJossStick");
    }

    @Override
    public void burn() {
        System.out.println("Burning an incense joss stick");
    }

    public void fragrance() {

            System.out.println("The joss stick has a pleasant fragrance");

    }

}
