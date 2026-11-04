package com.joysistvi.day18.exceptionhandling;

import java.util.Scanner;

public class ExceptionsHandling {

    public static void main(String[] args) {

        // NumberFormatException
        Scanner sc = new Scanner(System.in);

        try {
            String input = sc.nextLine();
            int choice = Integer.parseInt(input);
            System.out.println(choice);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Hello");

    }
}

/*
    // array out of bounce exception
    Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int choice = Integer.parseInt(input);
        System.out.println(choice);

        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[6]);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Hello");
 */