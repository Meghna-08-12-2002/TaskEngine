package com.xworkz.Override.internal;

public class MicrowaveOven extends Oven {
    public MicrowaveOven() {
        System.out.println("No argument constructor in MicrowaveOven");
    }

    @Override
    public void heat() {
        System.out.println("Quick heating using microwave technology");
    }

    public void defrost(Oven oven) {
        if (oven != null) {
            System.out.println("Defrosting using microwave oven");
        } else {
            System.out.println("Oven is null, cannot defrost");
        }
    }
}
