package com.xworks.runner;

import com.xworkz.java.exceptions.TooMuchSugarException;

public class SugarRunner {
    public static void main(String[] args) throws TooMuchSugarException {
        int sugarSpoons = 6;
        if (sugarSpoons > 3) {
            throw new TooMuchSugarException("Too much sugar! That's too sweet.");
        } else {
            System.out.println("Tea is perfectly sweet.");
        }
    }
}
