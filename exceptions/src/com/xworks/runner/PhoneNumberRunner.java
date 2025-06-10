package com.xworks.runner;

import com.xworkz.java.exceptions.InvalidPhoneNumberException;

public class PhoneNumberRunner {
    public static void main(String[] args) throws InvalidPhoneNumberException {
        String phone = "12345";
        if (phone.length() != 10) {
            throw new InvalidPhoneNumberException("Phone number must be 10 digits.");
        } else {
            System.out.println("Valid phone number.");
        }
    }
}
