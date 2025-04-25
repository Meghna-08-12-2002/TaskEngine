package com.xworkz.java.external;

import com.xworkz.java.internal.Printer;

public class PrintApp {
    private Printer printer;
    public PrintApp(Printer printer) {
        this.printer = printer;
    }
    public void startPrinting() {
        System.out.println("Starting printing job in PrintApp");
        if (printer != null) {
            printer.print();
        } else {
            System.out.println("Printer is null");
        }
    }
}
