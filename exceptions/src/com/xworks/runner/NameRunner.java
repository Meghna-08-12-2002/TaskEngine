package com.xworks.runner;

import com.xworkz.java.exceptions.EmptyNameException;

public class NameRunner {
    public static void main(String[] args) throws EmptyNameException {
        String name = "";
        if (name.isEmpty()) {
            throw new EmptyNameException("Name cannot be empty.");
        } else {
            System.out.println("Valid name: " + name);
        }
    }
}


