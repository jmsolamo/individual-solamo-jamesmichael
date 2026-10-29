package com.joysistvi.day13.string;

public class Activity10_Solamo {

        public static void main(String[] args) {
            String text = "   Hello Java   ";

            String newText = text.trim();

            System.out.println("Before: [" + text + "]");
            System.out.println("After: [" + newText + "]");
        }
    }






























/*
    String country = "Philippines";

        // Display the first and last characters
        char first = country.charAt(0);
        char last = country.charAt(country.length() - 1);

        System.out.println("Country: " + country);
        System.out.println("First character: " + first);
        System.out.println("Last character: " + last);

        // Count P and p
        int pCount = 0;

        // Count vowels
        int vowelCount = 0;

        for (int i = 0; i < country.length(); i++) {

            char letter = Character.toLowerCase(country.charAt(i));

            if (letter == 'p') {
                pCount++;
            }

            if (letter == 'a' || letter == 'e' ||
                    letter == 'i' || letter == 'o' ||
                    letter == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of P/p: " + pCount);
        System.out.println("Total vowels: " + vowelCount);
 */