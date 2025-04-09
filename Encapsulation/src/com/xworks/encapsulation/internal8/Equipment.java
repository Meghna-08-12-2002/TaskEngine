package com.xworks.encapsulation.internal8;

public class Equipment {

        public void showDetails() {
            Gym gym = new Gym();
            System.out.println("Name: " + gym.getName());
            System.out.println("Members: " + gym.getMembers());
            System.out.println("Has Trainer: " + gym.isHasTrainer());
            System.out.println("Monthly Fee: " + gym.getMonthlyFee());
            System.out.println("Location: " + gym.getLocation());

            gym.setName("Iron Paradise");
            gym.setMembers(200);
            gym.setHasTrainer(false);
            gym.setMonthlyFee(1500.0);
            gym.setLocation("Mumbai");

            System.out.println("Updated Name: " + gym.getName());
        }
    }

