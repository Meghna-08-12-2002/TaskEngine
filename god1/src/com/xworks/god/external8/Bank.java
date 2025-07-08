package com.xworks.god.external8;

import com.xworks.god.internal8.Card;

public class Bank {
    public Bank() {
        System.out.println("Bank constructor called");
    }

    public static void access() {
        Card card = new Card();
        Card.swipe();
    }
}
