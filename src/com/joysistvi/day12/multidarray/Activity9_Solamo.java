package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class Activity9_Solamo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.print("\t\tAverage Calculator");
        System.out.println("\n================================");

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt();
        input.nextLine();

        String[] subjectNames = new String[subjects];
        System.out.println("\nEnter subject names:");
        for(int i = 0; i < subjects; i++ ){
            System.out.print("Subject " +(i + 1) + ": ");
            subjectNames[i] = input.nextLine();
        }

        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];
        double[] average = new double[students];

        for (int j = 0; j < students; j++){
            System.out.print("\nName of the student " + (j + 1) + ": ");
            studentNames[j] = input.nextLine();

            double sum = 0;

            System.out.println("Enter grades for each subject:");
            for(int i = 0; i < subjects; i++){
                System.out.print(subjectNames[i] + ": ");
                grades[j][i] = input.nextDouble();
                sum += grades[j][i];
            }

            input.nextLine();

            average[j] = sum / subjects;
        }


        System.out.println("\n================================");
        System.out.print("\t\tGrades Report");
        System.out.println("\n================================");
        System.out.printf("%-20s", "Student Name");

        for (int i = 0; i < subjects; i++){
            System.out.printf("%-15s", subjectNames[i]);
        }

        System.out.printf("%-15s%n", "Average");

        for (int i = 0; i < students; i++) {

            System.out.printf("%-20s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-15.2f", grades[i][j]);
            }

            System.out.printf("%-15.2f%n", average[i]);
        }
        input.close();
    }
}
