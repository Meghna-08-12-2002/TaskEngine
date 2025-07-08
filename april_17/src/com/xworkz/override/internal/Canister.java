package com.xworkz.override.internal;

public class Canister {

        private String material;
        private int capacity;
        public Canister(String material, int capacity){
            this.material=material;
            this.capacity=capacity;
        }
        public void store(){
            System.out.println("The " + material + " canister with capacity " + capacity + " liters is storing items.");
        }
        @Override
        public String toString(){
            return "Canister{material='" + material + "', capacity=" + capacity + "}";
        }
}
