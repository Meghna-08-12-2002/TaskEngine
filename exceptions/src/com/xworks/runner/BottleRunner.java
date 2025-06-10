package com.xworks.runner;

import com.xworkz.java.exceptions.EmptyBottleException;

public class BottleRunner {
    public static void main(String[] args) throws EmptyBottleException {
        boolean isBottleEmpty = true;
        if (isBottleEmpty) {
            throw new EmptyBottleException("Bottle is empty! Please refill.");
        } else {
            System.out.println("Bottle has water.");
        }
    }
}
