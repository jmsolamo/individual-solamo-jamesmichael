package com.joysistvi.day16.methods;

import java.util.Scanner;

// Note: If you have your own exitMethod() defined below,
// you don't need to import an external one unless you prefer to use it!

public class LoadRegistrationSimulator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        dialUssdCode();
    }

    public static void dialUssdCode() {
        while (true) {
            System.out.println("Dial *143# to access Globe Services");
            System.out.print("Enter USSD Code: ");
            String dialCode = scanner.nextLine().trim();

            if (!dialCode.equals("*143#")) {
                System.out.println("Invalid Choice!, Please Try Again.\n");
                continue;
            }

            promptMainMenu();
        }
    }

    public static void promptMainMenu() {
        while (true) {
            System.out.println("\n====== Load Registration ======" + "\n[1] Go+" + "\n[2] Go" + "\n[3] GoEXTRA" + "\n[4] UNLI 5G" + "\n[5] ALL NET" + "\n[0] Exit");
            int mainChoice = getInput("Enter a choice: ");

            if (mainChoice == -1) {
                continue;
            }

            switch (mainChoice) {
                case 1 -> goPlusPromo();
                case 2 -> goPromo();
                case 3 -> goExtraPromo();
                case 4 -> gunli5GPromo();
                case 5 -> allNetPromo();
                case 0 -> exitMethod();
                default -> System.out.println("Invalid Choice, Pls Try Again!");
            }
        }
    }

    public static void goPlusPromo() {
        while (true) {
            System.out.println("\n====== Go+ Promos ======" + "\n[1] Go+99" + "\n[2] Go+129" + "\n[3] Go+149" + "\n[4] Back to Main Menu" + "\n[0] Exit");
            int choice = getInput("Enter a choice: ");

            if (choice == -1) {
                continue;
            }

            switch (choice) {
                case 1 -> promoDetailsMenu("Go+99", 8, 8);
                case 2 -> promoDetailsMenu("Go+129", 10, 8);
                case 3 -> promoDetailsMenu("Go+149", 16, 8);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid Choice, Pls Try Again!");
            }
        }
    }

    public static void goPromo() {
        while (true) {
            System.out.println("\n====== Go Promos ======" + "\n[1] Go50" + "\n[2] Go90" + "\n[3] Go140" + "\n[4] Back to Main Menu" + "\n[0] Exit");
            int choice = getInput("Enter a choice: ");

            if (choice == -1) {
                continue;
            }

            switch (choice) {
                case 1 -> promoDetailsMenu("Go50", 5, 3);
                case 2 -> promoDetailsMenu("Go90", 8, 8);
                case 3 -> promoDetailsMenu("Go140", 11, 8);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid Choice, Pls Try Again!");
            }
        }
    }

    public static void goExtraPromo() {
        while (true) {
            System.out.println("\n====== GoEXTRA Promos ======" + "\n[1] GoEXTRA99" + "\n[2] GoEXTRA129" + "\n[3] GoEXTRA149" + "\n[4] Back to Main Menu" + "\n[0] Exit");
            int choice = getInput("Enter a choice: ");

            if (choice == -1) {
                continue;
            }

            switch (choice) {
                case 1 -> promoDetailsMenu("GoEXTRA99", 6, 4);
                case 2 -> promoDetailsMenu("GoEXTRA129", 10, 5);
                case 3 -> promoDetailsMenu("GoEXTRA149", 14, 6);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid Choice, Pls Try Again!");
            }
        }
    }

    public static void gunli5GPromo() {
        while (true) {
            System.out.println("\n====== UNLI 5G Promos ======" + "\n[1] UNLI 5G 99" + "\n[2] UNLI 5G 149" + "\n[3] UNLI 5G 199" + "\n[4] Back to Main Menu" + "\n[0] Exit");
            int choice = getInput("Enter a choice: ");

            if (choice == -1) {
                continue;
            }

            switch (choice) {
                case 1 -> promoDetailsMenu("UNLI 5G 99", 3, 15);
                case 2 -> promoDetailsMenu("UNLI 5G 149", 5, 20);
                case 3 -> promoDetailsMenu("UNLI 5G 199", 7, 25);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid Choice, Pls Try Again!");
            }
        }
    }

    public static void allNetPromo() {
        while (true) {
            System.out.println("\n====== ALL NET Promos ======" + "\n[1] ALL NET99" + "\n[2] ALL NET149" + "\n[3] ALL NET199" + "\n[4] Back to Main Menu" + "\n[0] Exit");
            int choice = getInput("Enter a choice: ");

            if (choice == -1) {
                continue;
            }

            switch (choice) {
                case 1 -> promoDetailsMenu("ALL NET99", 4, 2);
                case 2 -> promoDetailsMenu("ALL NET149", 8, 4);
                case 3 -> promoDetailsMenu("ALL NET199", 12, 6);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid Choice, Pls Try Again!");
            }
        }
    }

    public static void promoDetailsMenu(String promoName, int gb, int freeGB) {
        while (true) {
            System.out.println("\n====== " + promoName + " Promo ======" + "\n-> Get " + gb + " GB for all sites +" + freeGB + " GB bonus" + "\n[1] Subscribe" + "\n[2] Back to Main Menu" + "\n[0] Exit");

            int actionChoice = getInput("Enter your choice: ");

            if (actionChoice == -1) {
                continue;
            }

            if (actionChoice < 0 || actionChoice > 2) {
                System.out.println("Invalid Choice, Pls Try Again!");
            } else {
                // Fixed switch syntax using traditional colon case labels
                switch (actionChoice) {
                    case 1:
                        System.out.println("\nYou are now successfully subscribed to " + promoName);
                        System.out.println("Thank You, Come Again!");
                        scanner.close();
                        System.exit(0);
                        break;
                    case 2:
                        System.out.println("Returning Back to Main Menu...");
                        return;
                    case 0:
                        exitMethod();
                        break;
                }
            }
        }
    }

    public static void exitMethod() {
        while (true) {
            System.out.println("\nAre you sure that you want to exit the program?");
            System.out.println("[Y] Yes - Exit Program");
            System.out.println("[N] No - Return to Main Menu");
            System.out.print("Enter your choice: ");
            String inputLine = scanner.nextLine().trim();

            if (inputLine.isEmpty()) {
                System.out.println("Invalid Choice! Please Try Again.");
                continue;
            }

            char choice = inputLine.charAt(0);

            if (choice == 'Y' || choice == 'y') {
                System.out.println("Exiting...");
                System.exit(0);
            } else if (choice == 'N' || choice == 'n') {
                System.out.println("Returning Back to Main Menu...");
                return;
            } else {
                System.out.println("Invalid Choice! Please Try Again.");
            }
        }
    }

    public static int getInput(String prompt) {

        while (true) {

            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a number.");
                return -1;
            }
        }
    }
}