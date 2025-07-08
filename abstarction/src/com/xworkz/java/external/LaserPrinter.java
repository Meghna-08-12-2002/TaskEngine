package com.xworkz.java.external;

import com.xworkz.java.internal.Printer;

public class LaserPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing using Laser printer");
    }
}
