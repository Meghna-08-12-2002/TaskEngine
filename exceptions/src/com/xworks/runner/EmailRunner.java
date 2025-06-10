package com.xworks.runner;

import com.xworkz.java.exceptions.InvalidEmailException;

public class EmailRunner {
    public static void main(String[] args) throws InvalidEmailException {
        String email = "abc.com";
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain '@'.");
        } else {
            System.out.println("Valid email: " + email);
        }
    }

}
