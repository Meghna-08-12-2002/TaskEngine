package com.xworks.java;

public class Replace {
    public static void main(String[] args) {
            String input = "you are welcome";
            String output = "";

            for (char c : input.toCharArray()) {
                if (isVowel(c)) {
                    output += getNextConsonant(c);
                } else {
                    output += c;
                }
            }

            System.out.println("Output: " + output);
        }

        private static boolean isVowel(char c) {
            return "aeiouAEIOU".indexOf(c) != -1;
        }

        private static char getNextConsonant(char vowel) {
            char next = (char) (vowel + 1);
            while (isVowel(next)) {
                next++;
            }
            return next;
        }
    }
