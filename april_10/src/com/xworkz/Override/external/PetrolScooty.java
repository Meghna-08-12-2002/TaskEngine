package com.xworkz.Override.external;

import com.xworkz.Override.internal.ElectricScooty;
import com.xworkz.Override.internal.Scooty;

public class PetrolScooty {
    public PetrolScooty() {
        System.out.println("No argument constructor of PetrolScooty");
    }

    public void road(Scooty scooty) {
        if (scooty != null) {
            scooty.ride();
            if (scooty instanceof ElectricScooty) {
                ElectricScooty eScooty = (ElectricScooty) scooty;
                eScooty.charge();
            } else {
                System.out.println("Generic scooty does not need charging");
            }
        } else {
            System.out.println("Scooty is null");
        }
    }
}
