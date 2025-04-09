package com.xworks.encapsulation.internal2;

public class Tank {

        private String name = "water";
        private int ltr = 400;
        private int avlbe = 200;
        private int height = 44;
        private int width = 50;

        public Tank() {
            System.out.println("running inside Tank");
        }

        void setName(String name) {
            this.name = name;
        }

        void setLtr(int ltr) {
            this.ltr = ltr;
        }

        void setAvlbe(int avlbe) {
            this.avlbe = avlbe;
        }

        void setHeight(int height) {
            this.height = height;
        }

        void setWidth(int width) {
            this.width = width;
        }

        public String getName() {
            return name;
        }

        public int getLtr() {
            return ltr;
        }

        public int getAvlbe() {
            return avlbe;
        }

        public int getHeight() {
            return height;
        }

        public int getWidth() {
            return width;
        }
    }


