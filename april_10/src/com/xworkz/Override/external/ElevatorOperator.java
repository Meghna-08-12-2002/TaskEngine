package com.xworkz.Override.external;

import com.xworkz.Override.internal.Elevator;
import com.xworkz.Override.internal.SmartElevator;

public class ElevatorOperator {
    public ElevatorOperator() {
        System.out.println("No argument constructor in ElevatorOperator");
    }

    public void operate(Elevator elevator) {
        if (elevator != null) {
            elevator.move();
            if (elevator instanceof SmartElevator) {
                SmartElevator smartElevator = (SmartElevator) elevator;
                smartElevator.autoClose();
            } else {
                System.out.println("Elevator is not a SmartElevator");
            }
        } else {
            System.out.println("Elevator is null");
        }
    }
}
