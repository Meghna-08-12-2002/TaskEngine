package com.xworks.java;

public class Convert {
    public static void main(String[] args) {

             String input = "hello how are you all set to go home";
            String[] words = input.split(" ");
            StringBuilder output = new StringBuilder();

            for (String word : words) {
                output.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1))
                        .append(" ");
            }
            System.out.println("Output: " + output.toString().trim());
        }
    }