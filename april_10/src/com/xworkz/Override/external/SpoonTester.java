package com.xworkz.Override.external;

import com.xworkz.Override.internal.SilverSpoon;
import com.xworkz.Override.internal.Spoon;

public class SpoonTester {
    public SpoonTester() {
        System.out.println("No argument constructor in SpoonTester");
    }

    public void test(Spoon spoon) {
        if (spoon != null) {
            spoon.scoop();
            if (spoon instanceof SilverSpoon) {
                SilverSpoon silver = (SilverSpoon) spoon;
                silver.shine();
            } else {
                System.out.println("Basic spoon being tested");
            }
        } else {
            System.out.println("No spoon to test");
        }
    }
}
