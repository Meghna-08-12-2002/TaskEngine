package com.xworks.encapsulation.external3;

import com.xworks.encapsulation.internal3.Badge;

public class Miltary {
    public void mil() {
        Badge badge = new Badge();
        System.out.println("Color: " + badge.getColor());
        System.out.println("Number: " + badge.getNumber());
        System.out.println("Rank: " + badge.getRank());
        System.out.println("Valid: " + badge.isValid());
        System.out.println("Authority: " + badge.getIssueAuthority());
    }
}
