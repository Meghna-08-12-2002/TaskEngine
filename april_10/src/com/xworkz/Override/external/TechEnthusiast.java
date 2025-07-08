package com.xworkz.Override.external;

import com.xworkz.Override.internal.Keyboard;
import com.xworkz.Override.internal.MechanicalKeyboard;

public class TechEnthusiast {
    public TechEnthusiast() {
        System.out.println("No argument constructor in TechEnthusiast");
    }

    public void useKeyboard(Keyboard keyboard) {
        if (keyboard != null) {
            keyboard.type();
            if (keyboard instanceof MechanicalKeyboard) {
                MechanicalKeyboard mechKeyboard = (MechanicalKeyboard) keyboard;
                mechKeyboard.backlight();
            } else {
                System.out.println("Standard keyboard, no backlight feature");
            }
        } else {
            System.out.println("Keyboard is null");
        }
    }
}
