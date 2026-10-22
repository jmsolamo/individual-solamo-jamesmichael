package com.joysistvi.day9.looping.activity;

public class Activity7_Solamo {

    public static void main(String[] args) {

        for (int table = 1; table <= 10; table++) {
            System.out.println("\nMultiplication Table of " + table);

            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(table + " x " + multiplier + " = " + (table * multiplier));
            }
        }
    }
}