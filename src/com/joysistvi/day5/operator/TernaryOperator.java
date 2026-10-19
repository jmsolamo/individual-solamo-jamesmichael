package com.joysistvi.day5.operator;

public class TernaryOperator {

    public static void main(String[] args) {
        //syntax
        //(condition) ? true block : false block;

        int age = 15;

       String result = (age >= 18) ? "Valid Age" : "Invalid Age";
       System.out.println(result);

        int num = 10;
        int num2= 20;

        int bigger = (num > num2) ? num : num2;
        System.out.println("Bigger number: " + bigger);

    }
}
