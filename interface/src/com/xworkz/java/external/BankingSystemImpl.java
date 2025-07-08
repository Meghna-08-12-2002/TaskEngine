package com.xworkz.java.external;

import com.xworkz.java.internal.BankingSystem;

public class BankingSystemImpl implements BankingSystem {
    public void openAccount() {
        System.out.println("BankingSystemImpl: openAccount");
    }
    public void closeAccount() {
        System.out.println("BankingSystemImpl: closeAccount");
    }
    public void deposit() {
        System.out.println("BankingSystemImpl: deposit");
    }
    public void withdraw() {
        System.out.println("BankingSystemImpl: withdraw");
    }
    public void transfer() {
        System.out.println("BankingSystemImpl: transfer");
    }
    public void checkBalance() {
        System.out.println("BankingSystemImpl: checkBalance");
    }
    public void printStatement() {
        System.out.println("BankingSystemImpl: printStatement");
    }
    public void applyLoan() {
        System.out.println("BankingSystemImpl: applyLoan");
    }
    public void payLoan() {
        System.out.println("BankingSystemImpl: payLoan");
    }
}
