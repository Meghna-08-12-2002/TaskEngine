package com.xworkz.Override.external;

import com.xworkz.Override.internal.MetalPincer;
import com.xworkz.Override.internal.Pincer;

public class ToolKit {
    public ToolKit() {
        System.out.println("No argument constructor in ToolKit");
    }

    public void checkTool(Pincer pincer) {
        if (pincer != null) {
            pincer.grip();
            if (pincer instanceof MetalPincer) {
                MetalPincer metal = (MetalPincer) pincer;
                metal.sharpen();
            } else {
                System.out.println("Not a metal pincer");
            }
        } else {
            System.out.println("Pincer is null");
        }
    }
}
