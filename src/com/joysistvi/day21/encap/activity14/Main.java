
package com.joysistvi.day21.encap.activity14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;
        String address;
        String email;
        String password;


        System.out.println("*********************************");
        System.out.println("*   User Account Registration   *");
        System.out.println("*********************************");

        while (true) {

            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine();

            if (UserAccountRegistration.isNotEmpty(firstName)) {
                break;
            }
            System.out.println("First Name cannot be empty!\n");
        }

            System.out.print("Enter your middle name (optional press enter if none): ");
            middleName = scanner.nextLine();

        while (true) {

            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine();

            if (UserAccountRegistration.isNotEmpty(lastName)) {
                break;
            }
            System.out.println("Last Name cannot be empty!\n");
        }

        while (true) {

            System.out.print("Enter your address: ");
            address = scanner.nextLine();

            if (UserAccountRegistration.isNotEmpty(address)) {
                break;
            }
            System.out.println("Address cannot be empty!\n");
        }

        while (true) {

            System.out.print("Enter your joysistvi email account: ");
            email = scanner.nextLine();

            if (UserAccountRegistration.isNotEmpty(email)) {
                if (UserAccountRegistration.emailFormat(email)) {
                    break;
                }
            } else {
                System.out.println("Email cannot be empty!\n");
            }
        }

        while (true) {

            System.out.println("\nYour password must contain:");
            System.out.println("- 8 - 16 characters");
            System.out.println("- Uppercase letter (A - Z)");
            System.out.println("- Lowercase letter (a - z)");
            System.out.println("- Numeric character (0 - 9)");
            System.out.println("- Special character (!@#$%^&*)");

            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if (UserAccountRegistration.isNotEmpty(password)) {
                if (UserAccountRegistration.passwordFormat(password)) {
                    break;
                }
            } else {
                System.out.println("Password cannot be empty!\n");
            }
        }

        UserAccountRegistration user = new UserAccountRegistration(firstName, middleName, lastName, address, email, password);

        System.out.println("\n--- User Account Created ---");
        System.out.println(user);
        scanner.close();
    }
}
