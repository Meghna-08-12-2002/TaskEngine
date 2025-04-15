package com.xworkz.Override.external;

import com.xworkz.Override.internal.Flashcard;
import com.xworkz.Override.internal.StudyFlashcard;

public class FlashcardHandler {
    public FlashcardHandler() {
        System.out.println("No argument constructor in FlashcardHandler");
    }

    public void manageFlashcard(Flashcard flashcard) {
        if (flashcard != null) {
            flashcard.displayFront();
            if (flashcard instanceof StudyFlashcard) {
                StudyFlashcard study = (StudyFlashcard) flashcard;
                study.review();
            } else {
                System.out.println("This is a general flashcard");
            }
        } else {
            System.out.println("Flashcard is null");
        }
    }
}
