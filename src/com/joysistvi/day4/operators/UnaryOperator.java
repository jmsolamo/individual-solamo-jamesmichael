package com.joysistvi.day4.operators;

public class UnaryOperator {

    public static void main(String[] args) {
        //negating an expression (-)
        int num = 69;
        System.out.println(-num);

        //inverting the value of a boolean
        boolean isActive = false;
        System.out.println(!isActive);

        //increment/decrement a value by one
        //post increment
        int num2 = 77;
        System.out.println(++num2);
        System.out.println(--num2);

        //pre increment
        int num3 = 69;
        System.out.println(num3--);
        System.out.println(num3);
    }
}
