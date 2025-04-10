package com.xworkz.Override.internal;

public class GreetingLetter extends Letter {
    public GreetingLetter() {
        System.out.println("No argument constructor in GreetingLetter");
    }

    @Override
    public void write() {
        System.out.println("Writing a greeting letter");
    }

    @Override
    public void send() {
        System.out.println("Sending the greeting letter with best wishes");
    }

    public void addGreeting() {
        System.out.println("Adding a special greeting to the letter");
    }
}
