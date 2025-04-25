package com.xworkz.java.external;

import com.xworkz.java.internal.Printer;

public class InkjetPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing using Inkjet printer");
    }
}
