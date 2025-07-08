package com.xworkz.Override.external;

import com.xworkz.Override.internal.Censer;
import com.xworkz.Override.internal.ElectricCenser;

public class CenserHandler {
    public CenserHandler(){
        System.out.println("no argumnent constructor of CenserHandler");
    }
    public void handleCenser(Censer censer) {
        if (censer != null) {
            censer.releaseFragrance();
            if (censer instanceof ElectricCenser) {
                ElectricCenser electric = (ElectricCenser) censer;
                electric.powerOn();
            } else {
                System.err.println("This is not an electric censer.");
            }
        } else {
            System.err.println("Censer is null.");
        }
    }
}
