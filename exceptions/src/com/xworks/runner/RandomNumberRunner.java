package com.xworks.runner;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberRunner {
        public static void main(String[] args) {
            Scanner scanner = null;

            try {
                scanner = new Scanner(System.in);
                Random random = new Random();
                int number = random.nextInt(10) + 1;

                System.out.print("Guess a number (1-10): ");
                int guess = scanner.nextInt();

                if (guess == number) {
                    System.out.println("Correct guess!");
                } else {
                    System.out.println("Wrong guess. Number was: " + number);
                }

            } catch (Exception e) {
                System.out.println("Invalid input!");
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        }
}


