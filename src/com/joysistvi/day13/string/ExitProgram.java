package com.joysistvi.day13.string;

import java.util.Scanner;

public class ExitProgram {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        exitMethod();

        input.close();

    }

    public static void exitMethod() {


        System.out.println("Are you sure you want to exit the program?");
        System.out.println("[Y] Yes - Exit Program");
        System.out.println("[N] No - Return to Main Menu");

        System.out.print("\nEnter your choice: ");
        String choice = String.valueOf(input.nextLine().trim().charAt(0));

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting......");
        } else {
            System.out.println("Returning Back to Main Menu");
        }

    }
}
