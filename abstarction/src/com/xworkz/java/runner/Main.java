package com.xworkz.java.runner;


import com.xworkz.java.external.*;
import com.xworkz.java.internal.*;

public class Main {
    public static void main(String[] args) {
        JDBC jdbc = new MyaqlJDBC();//loose coupling
        IplApp iplapp = new IplApp(jdbc);//abstarction
        iplapp.SaveTeamInfo();
        System.out.println("--------------------------------------");


        Payment payment = new CreditCardPayment();
        ECommerceApp app = new ECommerceApp(payment);
        app.checkout();
        System.out.println("--------------------------------------");

        Printer printer = new InkjetPrinter();
        PrintApp app1 = new PrintApp(printer);
        app1.startPrinting();
        System.out.println("--------------------------------------");

        Storage storage = new SSDStorage();
        DataCenterApp data = new DataCenterApp(storage);
        data.backupData();
        System.out.println("--------------------------------------");

        Notification note = new EmailNotification();
        AlertApp alert = new AlertApp(note);
        alert.alert();
        System.out.println("--------------------------------------");

        Transport transport = new BusTransport();
        JourneyApp journey = new JourneyApp(transport);
        journey.beginJourney();
        System.out.println("--------------------------------------");


    }
}
