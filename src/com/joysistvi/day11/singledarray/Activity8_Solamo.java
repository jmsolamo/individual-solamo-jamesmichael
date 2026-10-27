package com.joysistvi.day11.singledarray;

import java.util.Scanner;

public class Activity8_Solamo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        int highest = numbers[0];
        int lowest = numbers[0];

        System.out.println("\nYou Entered: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + (i + 1) + ": " + numbers[i]);
            sum += numbers[i];

            if(numbers[i] > highest){
                highest = numbers[i];
            }

            if(numbers[i] < lowest){
                lowest = numbers[i];
            }
        }

        double average = (double) sum / numbers.length;

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Number: " +highest);
        System.out.println("Lowest Number: " +lowest);

        input.close();
    }
}