package com.joysistvi.day6.operator;

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
        System.out.println("--- Task 2: Event Entry Check ---");
        int age = 18;
        boolean hasValidID = true;

        boolean isAllowed = age >= 18 && hasValidID;
        String answer = isAllowed ? "Yes" : "No";
        System.out.println("Allowed to enter the event: " +answer);


        /* Using the logical OR operator (||), determine if there are no classes today.
           Create a Java program that uses the following variables:
           boolean isWeekend;
           boolean isHoliday;

           Condition
           No classes if it is a weekend OR a holiday.
         */
        System.out.println("\n--- Task 3: Class Status Check ---");
        boolean isWeekend = true;
        boolean isHoliday = false;

        boolean isNoClass = isWeekend || isHoliday;
        String answer2 = isNoClass ? "Yes, no classes." : "No, we have a class.";
        System.out.println("Are there no class today? " +answer2);


        /*
        Use the ternary operator (? :) to determine if the student passed or failed.
        Create a Java program that uses the following variable:

        int score;

        Condition:
        75 and above = Passed
        Below 75 = Failed
         */
        System.out.println("\n--- Task 4: Pass or Fail Check ---");
        int score = 85;
        System.out.println("Score: " +score);
        String grade = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Result: " +grade);

        /*
        Use the ternary operator (? :) to determine the larger number.
        Create a Java program that uses the following variables:

        int num;
        int num2;
         */
        System.out.println("\n--- Task 5: Large Number Check ---");
        int num = 10;
        int num2 = 25;
        System.out.println("Number 1: " +num +", Number 2: " +num2);

        int largeNum = (num > num2) ? num : num2;
        System.out.println("The larger number is: " +largeNum);


    }
}
