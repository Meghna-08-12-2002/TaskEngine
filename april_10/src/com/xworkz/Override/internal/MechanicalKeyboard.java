package com.xworkz.Override.internal;

public class MechanicalKeyboard extends Keyboard {
    public MechanicalKeyboard() {
        System.out.println("No argument constructor in MechanicalKeyboard");
    }

    @Override
    public void type() {
        System.out.println("Typing with a mechanical keyboard");
    }

    public void backlight() {

            System.out.println("Backlight is enabled on the keyboard");

    }
}
