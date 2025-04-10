package com.xworkz.Override.internal;

public class FuelCanister extends Canister {
    public FuelCanister() {
        System.out.println("No argument constructor in FuelCanister");
    }

    @Override
    public void store() {
        System.out.println("Storing fuel in the fuel canister");
    }

    public void seal(Canister canister) {
        if (canister != null) {
            System.out.println("Sealing the fuel canister");
        } else {
            System.out.println("Canister reference is null, cannot seal");
        }
    }
}
