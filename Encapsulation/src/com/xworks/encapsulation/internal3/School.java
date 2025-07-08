package com.xworks.encapsulation.internal3;

public class School {
    public void scl() {
        Badge badge = new Badge();
        System.out.println("Color: " + badge.getColor());
        System.out.println("Number: " + badge.getNumber());
        System.out.println("Rank: " + badge.getRank());
        System.out.println("Valid: " + badge.isValid());
        System.out.println("Authority: " + badge.getIssueAuthority());

        badge.setColor("Red");
        badge.setNumber(202);
        badge.setRank("Major");
        badge.setValid(false);
        badge.setIssueAuthority("Govt Authority");

        System.out.println("Updated Color: " + badge.getColor());
    }
}
