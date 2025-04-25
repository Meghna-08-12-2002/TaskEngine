package com.xworkz.java.external;

import com.xworkz.java.internal.Payment;

public class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Processing UPI payment");
    }
}
