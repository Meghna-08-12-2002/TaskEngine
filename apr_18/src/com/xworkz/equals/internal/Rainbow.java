package com.xworkz.equals.internal;

import java.util.Objects;

public class Rainbow {

        private String color;
        private String season;
        private int arcLength;
        private double brightness;

        public void setColor(String color) {
            this.color = color;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public void setArcLength(int arcLength) {
            this.arcLength = arcLength;
        }

        public void setBrightness(double brightness) {
            this.brightness = brightness;
        }

        @Override
        public String toString() {
            return "Rainbow{" +
                    "color='" + color + '\'' +
                    ", season='" + season + '\'' +
                    ", arcLength=" + arcLength +
                    ", brightness=" + brightness +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Rainbow) {
                Rainbow other = (Rainbow) obj;
                return Objects.equals(this.color, other.color) &&
                        Objects.equals(this.season, other.season) &&
                        this.arcLength == other.arcLength &&
                        this.brightness == other.brightness;
            }
            return false;

    }

}
