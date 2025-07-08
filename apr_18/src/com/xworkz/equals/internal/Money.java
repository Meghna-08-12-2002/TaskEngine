package com.xworkz.equals.internal;

import java.util.Objects;

public class Money {
        private String currency;
        private String country;
        private double value;
        private String symbol;

        public Money(String currency, String country, double value, String symbol) {
            this.currency = currency;
            this.country = country;
            this.value = value;
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return "Money{currency='" + currency + "', country='" + country + "', value=" + value + ", symbol='" + symbol + "'}";
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Money) {
                Money other = (Money) obj;
                if (Objects.equals(this.currency, other.currency) &&
                        Objects.equals(this.country, other.country) &&
                        this.value == other.value &&
                        Objects.equals(this.symbol, other.symbol)) {
                    System.out.println("Money is matching..");
                    return true;
                }
            }
            return false;
        }
    }


