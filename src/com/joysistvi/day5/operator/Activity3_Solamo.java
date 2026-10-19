package com.joysistvi.day5.operator;

public class Activity3_Solamo {
    public static void main(String[] args) {

        /*Using the logical AND operator (&&), determine if the person is allowed to enter an event.
        Create a Java program that uses the following variables:

        int age;
        boolean hasValidID;

        Condition
        Age must be 18 or above.
        Must have a valid ID.
        */
        int age = 18;
        boolean hasValidID = true;

        boolean isAllowed = age >= 18 && hasValidID;
        System.out.println("Are you allowed?: " +isAllowed);


        /* Using the logical OR operator (||), determine if there are no classes today.
           Create a Java program that uses the following variables:
           boolean isWeekend;
           boolean isHoliday;

           Condition
           No classes if it is a weekend OR a holiday.
         */
        boolean isWeekend = true;
        boolean isHoliday = true;

        boolean isNoClass = isWeekend || isHoliday;
        System.out.println("Do we have a class?: " +isNoClass);


        /*
        Use the ternary operator (? :) to determine if the student passed or failed.
        Create a Java program that uses the following variable:

        int score;

        Condition:
        75 and above = Passed
        Below 75 = Failed
         */

        int score = 99;

        String grade = (score >= 75) ? "Pass" : "Failed";
        System.out.println("What is your grade: " +grade);

        /*
        Use the ternary operator (? :) to determine the larger number.
        Create a Java program that uses the following variables:

        int num;
        int num2;
         */

        int num = 99;
        int num2 = 100;

        int largeNum = (num > num2) ? num : num2;
        System.out.println("What is the largest number?: " +largeNum);


    }
}
