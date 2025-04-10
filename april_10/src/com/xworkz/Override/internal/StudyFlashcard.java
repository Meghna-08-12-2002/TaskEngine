package com.xworkz.Override.internal;

public class StudyFlashcard extends Flashcard {
    public StudyFlashcard() {
        System.out.println("No argument constructor in StudyFlashcard");
    }

    @Override
    public void displayFront() {
        System.out.println("Displaying the question on the front of the flashcard");
    }

    @Override
    public void displayBack() {
        System.out.println("Displaying the answer on the back of the flashcard");
    }

    public void review() {
        System.out.println("Reviewing the flashcard for better retention");
    }
}
