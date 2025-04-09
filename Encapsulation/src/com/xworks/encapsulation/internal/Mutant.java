package com.xworks.encapsulation.internal;

    public class Mutant {
            private String type = "Omega";
            private int level = 5;
            private String ability = "Telepathy";
            private boolean active = true;
            private double energy = 98.5;

            public Mutant() {
                System.out.println("running inside the Mutant");
            }

            void setType(String type) {
                this.type = type;
            }

            void setLevel(int level) {
                this.level = level;
            }

            void setAbility(String ability) {
                this.ability = ability;
            }

            void setActive(boolean active) {
                this.active = active;
            }

            void setEnergy(double energy) {
                this.energy = energy;
            }

            public String getType() {
                return this.type;
            }

            public int getLevel() {
                return this.level;
            }

            public String getAbility() {
                return this.ability;
            }

            public boolean isActive() {
                return this.active;
            }

            public double getEnergy() {
                return this.energy;
            }
        }

