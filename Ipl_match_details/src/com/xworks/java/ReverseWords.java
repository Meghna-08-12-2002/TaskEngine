package com.xworks.java;
public class ReverseWords {
    public static void main(String[] args) {
                       String input = "rcb will win the match";
                       String[] words = input.split(" ");
                       StringBuilder output = new StringBuilder();

                for (int i = 0; i < words.length; i++) {
                    if (i == 2 || i == 3) {
                        output.append(new StringBuilder(words[i]).reverse());
                    } else {
                        output.append(words[i]);
                    }
                    output.append(" ");
                }

                System.out.println(output.toString().trim());
            }
        }

