package com.xworks.runner;

import com.xworkz.java.exceptions.InvalidAgeException;

public class AgeRunner {
    public static void main(String[] args) throws InvalidAgeException {
        int age = 22;

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Valid age!");
        }

    }
}
