package com.xworks.java;

public class Count {
    public static void main(String[] args) {

                String input = "rcb will win the match";
                String[] words = input.split(" ");

                for (String word : words) {
                    int count = 0;
                    for (char ch : word.toCharArray()) {
                        if (Character.isLetter(ch)) {
                            count++;
                        }
                    }
                    System.out.print("Word: " + word + "count: " + count);
                }
            }
        }




