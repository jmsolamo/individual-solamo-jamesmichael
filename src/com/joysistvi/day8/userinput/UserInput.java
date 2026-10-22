package com.joysistvi.day8.userinput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //Instantiate Scanner Class / Create an object of scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Day: ");
        int day = scanner.nextInt();
        String dayName = "";

        if (day == 1) {
            // Executes when day is 1
            dayName = "Sunday";
        } else if (day == 2) {
            // Executes when day is 2
            dayName = "Monday";
        } else if (day == 3) {
            // Executes when day is 3
            dayName = "Tuesday";
        } else if (day == 4) {
            // Executes when day is 4
            dayName = "Wednesday";
        } else if (day == 5) {
            // Executes when day is 5
            dayName = "Thursday";
        } else if (day == 6) {
            // Executes when day is 6
            dayName = "Friday";
        } else if (day == 7) {
            // Executes when day is 7
            dayName = "Saturday";
        }

        System.out.println(dayName);
    }
}