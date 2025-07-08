package com.xworkz.java.external;

import com.xworkz.java.internal.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Processing credit card payment");
    }
}
