package com.xworkz.Override.internal;

public class CricketMatch
        extends Match {
    public CricketMatch() {
        System.out.println("No argument constructor in CricketMatch");
    }

    @Override
    public void start() {
        System.out.println("Cricket match has started with a toss");
    }

    public void toss(Match match) {
        if (match != null) {
            System.out.println("Toss is being conducted");
        } else {
            System.out.println("Match is null, toss can't be conducted");
        }
    }
}
