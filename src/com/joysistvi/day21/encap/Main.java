package com.joysistvi.day21.encap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** Ballpen Information Program ***");
        System.out.println("Please enter the details below:\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter point size: ");
        double pointSize = scanner.nextDouble();

        System.out.print("Enter weight in grams: ");
        double weightInGrams = scanner.nextDouble();

        Ballpen ballpen = new Ballpen(brand, color, pointSize, weightInGrams);


        System.out.println("\n=== Ballpen Details ===");
        System.out.println(ballpen);

//        Ballpen ballpen = new Ballpen("Pilot", "Black", 0.5, 1);
//        Ballpen ballpen2 = new Ballpen("Panda", "Red", 0.7, 2);


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("********* Ballpen Information Program **********");
//        System.out.println("Please enter the details below:\n");
//
//        System.out.print("Enter brand: ");
//        ballpen.setBrand(scanner.nextLine());
//
//        System.out.print("Enter color: ");
//        ballpen.setColor(scanner.nextLine());
//
//        System.out.print("Enter point size: ");
//        ballpen.setPointSize(scanner.nextDouble());
//
//        System.out.print("Enter weight in grams: ");
//        ballpen.setWeightInGrams(scanner.nextDouble());
//
//        System.out.println("\n======== Ballpen Details ========");
//        System.out.println("Brand: " + ballpen.getBrand());
//        System.out.println("Color: " + ballpen.getColor());
//        System.out.println("Point Size: " + ballpen.getPointSize());
//        System.out.println("Weight in Grams: " + ballpen.getWeightInGrams() + "g");

    }
}