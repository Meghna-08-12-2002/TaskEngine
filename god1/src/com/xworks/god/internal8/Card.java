package com.xworks.god.internal8;

public class Card {
    public Card() {
        System.out.println("Card constructor called");
    }

    public static void swipe() {
        System.out.println("Card: public swipe method");
    }

    void insert() {
        System.out.println("Card: package-default insert method");
    }

    private void block() {
        System.out.println("Card: private block method");
    }
}
