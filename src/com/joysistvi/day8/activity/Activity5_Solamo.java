package com.joysistvi.day8.activity;

import java.util.Scanner;

public class Activity5_Solamo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        int promoChoice;
        int subChoice;
        String promoName;

        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String dialCode = input.nextLine();

        if (!dialCode.equals("*143#")){
            System.out.println("\nInvalid Choice!, Please Try Again.");
            input.close();
            return;
        }

        System.out.println(
        "\n====== Load Registration ======"+
        "\n[1] Go+"+
        "\n[2] Go"+
        "\n[3] GoEXTRA"+
        "\n[4] UNLI 5G"+
        "\n[5] ALL NET"
        );
        System.out.print("Enter a choice: ");
        choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println(
                "\n====== Go+ Promos ======" +
                "\n[1] Go+99" +
                "\n[2] Go+129" +
                "\n[3] Go+149"
                );
                System.out.print("Enter a choice: ");
                promoChoice = input.nextInt();

                if (promoChoice < 1 || promoChoice > 3) {
                    System.out.println("Invalid Promo!, Please Try Again!");
                    input.close();
                    return;
                }
                promoName = (promoChoice == 1) ? "Go+99"
                          : (promoChoice == 2) ? "Go+129"
                          : "Go+149";

                System.out.println(
                "\n====== " +promoName +" Promo ======" +
                "\n-> Get 8 GB for all sites + 8GB" +
                "\n[1] Subscribe" +
                "\n[2] Exit"
                );
                System.out.print("Enter a choice: ");
                subChoice = input.nextInt();

                switch (subChoice){
                    case 1:
                        System.out.println("\nYou are now subscribed to " +promoName);
                        System.out.println("Thank You, Come Again!");
                        break;

                    case 2:
                        System.out.println("\nThank You, Come Again!");
                        break;

                    default:
                        System.out.println("\nInvalid Choice!, Please Try Again.");
                }
                break;

            case 2:
                System.out.println(
                "\n====== Go Promos ======" +
                "\n[1] Go50" +
                "\n[2] Go90" +
                "\n[3] Go120"
                );
                System.out.print("Enter a choice: ");
                promoChoice = input.nextInt();

                if (promoChoice < 1 || promoChoice > 3) {
                    System.out.println("Invalid Promo!, Please Try Again!");
                    input.close();
                    return;
                }
                promoName = (promoChoice == 1) ? "Go50"
                          : (promoChoice == 2) ? "Go90"
                          : "Go120";

                System.out.println(
                "\n====== " +promoName +" Promo ======" +
                "\n-> Get 8 GB for all sites + 8GB" +
                "\n[1] Subscribe" +
                "\n[2] Exit"
                );
                System.out.print("Enter a choice: ");
                subChoice = input.nextInt();

                switch (subChoice){
                    case 1:
                        System.out.println("\nYou are now subscribed to " +promoName);
                        System.out.println("Thank You, Come Again!");
                        break;

                    case 2:
                        System.out.println("\nThank You, Come Again!");
                        break;

                    default:
                        System.out.println("\nInvalid Choice!, Please Try Again.");
                }
                break;

            case 3:
                System.out.println(
                "\n====== GoEXTRA Promos ======" +
                "\n[1] GoEXTRA99" +
                "\n[2] GoEXTRA129" +
                "\n[3] GoEXTRA149"
                );
                System.out.print("Enter a choice: ");
                promoChoice = input.nextInt();

                if (promoChoice < 1 || promoChoice > 3) {
                    System.out.println("Invalid Promo!, Please Try Again!");
                    input.close();
                    return;
                }
                promoName = (promoChoice == 1) ? "GoEXTRA99"
                          : (promoChoice == 2) ? "GoEXTRA129"
                          : "GoEXTRA149";

                System.out.println(
                "\n====== " +promoName +" Promo ======" +
                "\n-> Get 8 GB for all sites + 8GB" +
                "\n[1] Subscribe" +
                "\n[2] Exit"
                );
                System.out.print("Enter a choice: ");
                subChoice = input.nextInt();

                switch (subChoice){
                    case 1:
                        System.out.println("\nYou are now subscribed to " +promoName);
                        System.out.println("Thank You, Come Again!");
                        break;

                    case 2:
                        System.out.println("\nThank You, Come Again!");
                        break;

                    default:
                        System.out.println("\nInvalid Choice!, Please Try Again.");
                }
                break;

            case 4:
                System.out.println(
                "\n====== UNLI 5G Promos ======" +
                "\n[1] UNLI 5G 99" +
                "\n[2] UNLI 5G 149" +
                "\n[3] UNLI 5G 199"
                );
                System.out.print("Enter a choice: ");
                promoChoice = input.nextInt();

                if (promoChoice < 1 || promoChoice > 3) {
                    System.out.println("Invalid Promo!, Please Try Again!");
                    input.close();
                    return;
                }
                promoName = (promoChoice == 1) ? "UNLI 5G 99"
                          : (promoChoice == 2) ? "UNLI 5G 149"
                          : "UNLI 5G 199";

                System.out.println(
                "\n====== " +promoName +" Promo ======" +
                "\n-> Get 8 GB for all sites + 8GB" +
                "\n[1] Subscribe" +
                "\n[2] Exit"
                );
                System.out.print("Enter a choice: ");
                subChoice = input.nextInt();

                switch (subChoice){
                    case 1:
                        System.out.println("\nYou are now subscribed to " +promoName);
                        System.out.println("Thank You, Come Again!");
                        break;

                    case 2:
                        System.out.println("\nThank You, Come Again!");
                        break;

                    default:
                        System.out.println("\nInvalid Choice!, Please Try Again.");
                }
                break;

            case 5:
                System.out.println(
                "\n====== ALL NET Promos ======" +
                "\n[1] ALL NET99" +
                "\n[2] ALL NET149" +
                "\n[3] ALL NET199"
                );
                System.out.print("Enter a choice: ");
                promoChoice = input.nextInt();

                if (promoChoice < 1 || promoChoice > 3) {
                    System.out.println("Invalid Promo!, Please Try Again!");
                    input.close();
                    return;
                }
                promoName = (promoChoice == 1) ? "ALL NET99"
                          : (promoChoice == 2) ? "ALL NET149"
                          : "ALL NET199";

                System.out.println(
                "\n====== " +promoName +" Promo ======" +
                "\n-> Get 8 GB for all sites + 8GB" +
                "\n[1] Subscribe" +
                "\n[2] Exit"
                );
                System.out.print("Enter a choice: ");
                subChoice = input.nextInt();

                switch (subChoice){
                    case 1:
                        System.out.println("\nYou are now subscribed to " +promoName);
                        System.out.println("Thank You, Come Again!");
                        break;

                    case 2:
                        System.out.println("\nThank You, Come Again!");
                        break;

                    default:
                        System.out.println("\nInvalid Choice!, Please Try Again.");
                }
                break;

            default:
                System.out.println("\nInvalid Choice!, Please Try Again.");
                input.close();
                return;
        }

        input.close();
    }
}