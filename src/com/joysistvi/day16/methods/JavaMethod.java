package com.joysistvi.day16.methods;

public class JavaMethod {

    public static void main(String[] args) {

        int year = 2027;

        if (year == 2026) {

            greet("James", 23);

        } else if (year == 2027) {

            greet("JM", 24);

        }

    }
    // void does not return anyting
    public static void greet(String name, int age){

        printMoto("Hello my name is " + name);
        printMoto("I am " + age + " years old.");

    }

    public static void printMoto(String word) {
        System.out.println(word);
    }
}

/*
    public static void main(String[] args) {

        sum(5, 10);
        System.out.println(sum(5, 10));

    }

    public static int sum(int a, int b){

        return a + b;

    }
 */