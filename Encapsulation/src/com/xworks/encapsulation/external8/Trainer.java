package com.xworks.encapsulation.external8;

import com.xworks.encapsulation.internal8.Gym;

public class Trainer {

        public void trainerInfo() {
            Gym gym = new Gym();
            System.out.println("Name: " + gym.getName());
            System.out.println("Members: " + gym.getMembers());
            System.out.println("Has Trainer: " + gym.isHasTrainer());
            System.out.println("Monthly Fee: " + gym.getMonthlyFee());
            System.out.println("Location: " + gym.getLocation());
        }
    }


