package com.xworks.runner;

import com.xworkz.java.exceptions.OvercookedNoodlesException;

public class NoodlesRunner {
    public static void main(String[] args) throws OvercookedNoodlesException {
        int cookingTime = 10;
        if (cookingTime > 5) {
            throw new OvercookedNoodlesException("Noodles are overcooked! Try again.");
        } else {
            System.out.println("Perfect noodles!");
        }
    }
}
