package com.xworkz.Override.external;

import com.xworkz.Override.internal.GreetingLetter;
import com.xworkz.Override.internal.Letter;

public class LetterHandler {
    public LetterHandler() {
        System.out.println("No argument constructor in LetterHandler");
    }

    public void manageLetter(Letter letter) {
        if (letter != null) {
            letter.send();
            if (letter instanceof GreetingLetter) {
                GreetingLetter greeting = (GreetingLetter) letter;
                greeting.addGreeting();
            } else {
                System.out.println("This is a general letter");
            }
        } else {
            System.out.println("Letter is null");
        }
    }
}
