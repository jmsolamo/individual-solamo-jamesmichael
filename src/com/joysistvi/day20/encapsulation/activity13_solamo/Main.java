package com.joysistvi.day20.encapsulation.activity13_solamo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserAccountRegistration user = new UserAccountRegistration();
        Scanner input = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("*   User Account Registration   *");
        System.out.println("*********************************");

        System.out.print("\nEnter your first name: ");
        user.setFirstName(input.nextLine());

        System.out.print("Enter your middle name: ");
        user.setMiddleName(input.nextLine());

        System.out.print("Enter your last name: ");
        user.setLastName(input.nextLine());

        System.out.print("Enter your address: ");
        user.setAddress(input.nextLine());

        while (true) {

            System.out.print("Enter your joysis tvi email account: ");

            if (user.setEmail(input.nextLine())) {
                break;
            }

            System.out.println("Please try again!\n");
        }

        while (true) {

            System.out.println("Your password must contain,");
            System.out.println("- 8 - 16 characters");
            System.out.println("- Uppercase letter (A - Z)");
            System.out.println("- Lowercase letter (a - z)");
            System.out.println("- Numeric character (0 - 9)");
            System.out.println("- Special character (!@#$%^&*)");
            System.out.print("Enter your password: ");

            if (user.setPassword(input.nextLine())) {
                break;
            }

            System.out.println("Please try again!\n");
        }

        System.out.println("\n--- User Account Created ---");
        System.out.println("Full Name: " + user.getFirstName() + " " + user.getMiddleName() + " " + user.getLastName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());


    }
}
