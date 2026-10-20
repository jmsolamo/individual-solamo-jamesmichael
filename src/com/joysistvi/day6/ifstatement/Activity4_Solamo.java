package com.joysistvi.day6.ifstatement;

import java.util.Scanner;

public class Activity4_Solamo {

    public static void main(String[] args) {

        /*
        Age: 0 - 2 → Baby
        Age: 3 - 12 → Child
        Age: 13 - 19 → Teenager
        Age: 20 - 29 → Young Adult
        Age: 30 - 59 → Adult
        Age: 60 - 100 → Senior
        */

        Scanner sc = new Scanner(System.in);

        int age;
        String category;

        System.out.print("Enter the age: ");
        age = sc.nextInt();

        if(age < 0 || age > 100){
            System.out.println("Invalid Age");
            sc.close();
            return;
        }

            if (age >= 60) {
                category = "Senior";
            } else if (age >= 30) {
                category = "Adult";
            } else if (age >= 20) {
                category = "Young Adult";
            } else if (age >= 13) {
                category = "Teenager";
            } else if (age >= 3) {
                category = "Child";
            } else {
                category = "Baby";
            }
            System.out.println("Category: " + category);
            sc.close();


        /*
        if(age >=0 && age <=100){
            if(age >= 60){
                category = "Senior";
            } else if (age >= 30) {
                category = "Adult";
            }else if (age >= 20) {
                category = "Young Adult";
            }else if (age >= 13) {
                category = "Teenager";
            }else if (age >= 3) {
                category = "Child";
            }else {
                category = "Baby";
            }
            System.out.println("Category: " +category);
        }else{
            System.out.println("Invalid Age");
        }

        sc.close();

         */
    }
}