package com.xworkz.Override.internal;

public class ManicureNail extends Nail {
    public ManicureNail() {
        System.out.println("No argument constructor in ManicureNail");
    }

    @Override
    public void file() {
        System.out.println("Filing the manicure nail");
    }

    public void polish(Nail nail) {
        if(nail != null) {
            System.out.println("Polishing the nail to perfection");
        } else {
            System.out.println("No nail available for polishing");
        }
    }
}
