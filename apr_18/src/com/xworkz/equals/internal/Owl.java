package com.xworkz.equals.internal;

import java.util.Objects;

public class Owl {


        private String species;
        private String color;
        private int age;
        private String habitat;

        // Setter methods
        public void setSpecies(String species) {
            this.species = species;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHabitat(String habitat) {
            this.habitat = habitat;
        }

        @Override
        public String toString() {
            return "Owl{" +
                    "species='" + species + '\'' +
                    ", color='" + color + '\'' +
                    ", age=" + age +
                    ", habitat='" + habitat + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Owl) {
                Owl other = (Owl) obj;
                if (Objects.equals(this.species, other.species) &&
                        Objects.equals(this.color, other.color) &&
                        this.age == other.age &&
                        Objects.equals(this.habitat, other.habitat)) {
                    System.out.println("Owl is matching..");
                    return true;
                }
            }
            return false;

    }

}
