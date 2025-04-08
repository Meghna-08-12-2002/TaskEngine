package com.xworks.god.internal8;

public class Payment {
    public Payment() {
        System.out.println("Payment constructor called");
    }

    public static void process() {
        Card card = new Card();
        Card.swipe();
        card.insert();
    }
}
