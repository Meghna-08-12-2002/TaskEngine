package com.xworkz.Override.internal;

public class DinnerPlatter extends Platter {
    public DinnerPlatter() {
        System.out.println("No argument constructor in DinnerPlatter");
    }

    @Override
    public void serve() {
        System.out.println("Serving food on a dinner platter");
    }

    public void arrange(Platter platter) {
        if (platter != null) {
            System.out.println("Arranging food on the platter");
        } else {
            System.out.println("Platter is null, cannot arrange food");
        }
    }
}
