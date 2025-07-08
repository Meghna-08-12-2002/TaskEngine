package com.xworks.runner;

import com.xworkz.java.exceptions.MissingSocksException;

public class SocksRunner {
    public static void main(String[] args) throws MissingSocksException {
        int socksFound = 1;
        if (socksFound < 2) {
            throw new MissingSocksException("Where's the other sock?");
        } else {
            System.out.println("Socks are ready to wear!");
        }
    }
}
