package com.xworkz.java.external;

import com.xworkz.java.internal.Payment;

public class ECommerceApp {
    private Payment payment;
    public ECommerceApp(Payment payment) {
        this.payment = payment;
    }
    public void checkout() {
        System.out.println("Checkout started in ECommerceApp");
        if (payment != null) {
            payment.pay();
        } else {
            System.out.println("Payment method is null");
        }
    }
}
