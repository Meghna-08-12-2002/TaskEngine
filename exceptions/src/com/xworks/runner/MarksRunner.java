package com.xworks.runner;

import com.xworkz.java.exceptions.InvalidMarksException;

public class MarksRunner {
    public static void main(String[] args) throws InvalidMarksException {
        int marks = 110;
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        } else {
            System.out.println("Valid marks: " + marks);
        }
    }
}
