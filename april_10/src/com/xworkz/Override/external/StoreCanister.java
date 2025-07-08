package com.xworkz.Override.external;

import com.xworkz.Override.internal.Canister;
import com.xworkz.Override.internal.FuelCanister;

public class StoreCanister {
    public StoreCanister(){
        System.out.println("no argument constructor of storeCanister");
    }
    public void store(Canister canister) {
        if (canister != null) {
            canister.store();  // Call the store method from Canister class

            if (canister instanceof FuelCanister) {  // Check if the canister is a FuelCanister
                FuelCanister fuelCanister = (FuelCanister) canister;  // Cast to FuelCanister
                fuelCanister.seal();  // Call the seal method specific to FuelCanister
            } else {
                System.err.println("This canister is not for fuel storage.");
            }
        } else {
            System.err.println("Canister is null.");
        }
    }
}
