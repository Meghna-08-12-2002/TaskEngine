package com.xworkz.Override.external;

import com.xworkz.Override.internal.CricketMatch;
import com.xworkz.Override.internal.Match;

public class MatchManager {
    public MatchManager() {
        System.out.println("No argument constructor in MatchManager");
    }

    public void manageMatch(Match match) {
        if (match != null) {
            match.start();
            if (match instanceof CricketMatch) {
                CricketMatch cricketMatch = (CricketMatch) match;
                cricketMatch.toss();
            } else {
                System.out.println("This is a general match");
            }
        } else {
            System.out.println("No match to manage");
        }
    }
}
