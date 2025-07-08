package com.xworkz.java.runner;

import com.xworkz.java.external.*;
import com.xworkz.java.internal.*;

public class Main {
    public static void main(String[] args) {
        Clickable c1 = new ClickableImpl();
        ClickableImpl c1c = new ClickableImpl();
        c1.click();
        c1c.click();

        Uploader u1 = new UploaderImpl();
        UploaderImpl u1c = new UploaderImpl();
        u1.upload();
        u1.pauseUpload();
        u1.cancelUpload();
        u1c.upload();
        u1c.pauseUpload();
        u1c.cancelUpload();

        FileHandler f1 = new FileHandlerImpl();
        FileHandlerImpl f1c = new FileHandlerImpl();
        f1.open();
        f1.read();
        f1.write();
        f1.close();
        f1.delete();
        f1c.open();
        f1c.read();
        f1c.write();
        f1c.close();
        f1c.delete();

        SmartHomeSystem s1 = new SmartHomeSystemImpl();
        SmartHomeSystemImpl s1c = new SmartHomeSystemImpl();
        s1.turnOnLights();
        s1.turnOffLights();
        s1.setThermostat();
        s1.lockDoors();
        s1.unlockDoors();
        s1.playMusic();
        s1.stopMusic();
        s1c.turnOnLights();
        s1c.turnOffLights();
        s1c.setThermostat();
        s1c.lockDoors();
        s1c.unlockDoors();
        s1c.playMusic();
        s1c.stopMusic();

        BankingSystem b1 = new BankingSystemImpl();
        BankingSystemImpl b1c = new BankingSystemImpl();
        b1.openAccount();
        b1.closeAccount();
        b1.deposit();
        b1.withdraw();
        b1.transfer();
        b1.checkBalance();
        b1.printStatement();
        b1.applyLoan();
        b1.payLoan();
        b1c.openAccount();
        b1c.closeAccount();
        b1c.deposit();
        b1c.withdraw();
        b1c.transfer();
        b1c.checkBalance();
        b1c.printStatement();
        b1c.applyLoan();
        b1c.payLoan();
    }
}
