package com.xworkz.Override.external;

import com.xworkz.Override.internal.GlassWindow;
import com.xworkz.Override.internal.Window;

public class WindowHandler {
    public WindowHandler() {
        System.out.println("No argument constructor in WindowHandler");
    }

    public void handleWindow(Window window) {
        if (window != null) {
            window.open();
            if (window instanceof GlassWindow) {
                GlassWindow glassWindow = (GlassWindow) window;
                glassWindow.clean();
            } else {
                System.out.println("Not a Glass Window");
            }
        } else {
            System.out.println("Window is null");
        }
    }
}
