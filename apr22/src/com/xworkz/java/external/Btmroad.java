package com.xworkz.java.external;

import com.xworkz.java.internal.rule.Traffic;

public class Btmroad implements Traffic {
    @Override
    public void road() {
        System.out.println("running road in btmroad");
    }
}
