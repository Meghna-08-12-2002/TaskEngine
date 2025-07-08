package com.xworkz.Override.external;

import com.xworkz.Override.internal.Screen;
import com.xworkz.Override.internal.TouchScreen;

public class ScreenHandler {
    public ScreenHandler() {
        System.out.println("No argument constructor in ScreenHandler");
    }

    public void manageScreen(Screen screen) {
        if (screen != null) {
            screen.display();
            if (screen instanceof TouchScreen) {
                TouchScreen touch = (TouchScreen) screen;
                touch.touch();
            } else {
                System.out.println("This is a regular screen");
            }
        } else {
            System.out.println("Screen is null");
        }
    }
}
