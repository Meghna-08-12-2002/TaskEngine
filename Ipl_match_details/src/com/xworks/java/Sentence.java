package com.xworks.java;

public class Sentence {
    public static void main(String[] args) {

                String sentence = "Today is my day,I  will do best";
                int vowels = 0;
                int consonants = 0;
                for (char c : sentence.toCharArray()) {
                if (Character.isLetter(c) ||"AEIOUaeiou".indexOf(c) != -1 ) {
                           vowels++;
                        } else {
                            consonants++;
                        }
                    }
                System.out.println("Vowels: " + vowels);
                System.out.println("Consonants: " + consonants);
            }
        }

