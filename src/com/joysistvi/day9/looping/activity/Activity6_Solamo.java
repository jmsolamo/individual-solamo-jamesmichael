package com.joysistvi.day9.looping.activity;

import java.util.Scanner;

public class Activity6_Solamo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter the multiplication table you want to display ( 1 - 10 ) : ");
            int userInput = input.nextInt();

            if (userInput < 1 || userInput > 10){
                System.out.println("Invalid Choice, Please Choose From 1 - 10 only!\n");
                continue;
            }

            System.out.println("\nMultiplication of " +userInput);

            for (int i = 1; i <= 10; i++) {
                System.out.println(userInput + " x " + i + " = " + (userInput * i));
            }
            break;

        }while(true);

        input.close();
    }
}