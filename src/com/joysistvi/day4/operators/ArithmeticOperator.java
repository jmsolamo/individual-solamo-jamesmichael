package com.joysistvi.day4.operators;

import jdk.swing.interop.SwingInterOpUtils;

public class ArithmeticOperator {

    public static void main(String[] args) {

        int num = 20;
        int num2 = 3;
        int sum = num + num2;
        int difference = num - num2;
        int product = num * num2;
        int quotient = num / num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // % -> Modulus
        int number = 31;
        int number2 = 10;
        double remainder = number % number2;
        System.out.println(remainder);
    }
}