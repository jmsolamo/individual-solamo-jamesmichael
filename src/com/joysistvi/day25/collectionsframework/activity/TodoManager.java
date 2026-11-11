package com.joysistvi.day25.collectionsframework.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoManager {

    static Scanner scanner = new Scanner(System.in);
    static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {

        showMenu();
    }

    public static void showMenu() {
        while (true) {
            System.out.println("\n===== Todo Manager =====");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("0. Exit");
            int choice = getInput("Enter your choice: ");

            switch (choice) {

                case 1 -> addTask();
                case 2 -> viewTask();
                case 3 -> updateTask();
                case 4 -> removeTask();
                case 5 -> clearTask();
                case 0 -> exit();
                default -> System.out.println("Invalid Choice, Pls Try Again!");
            }
        }
    }

    public static void addTask() {

        while (true) {
            System.out.print("\nEnter your task: ");
            String task = scanner.nextLine().trim();

            if (task.isEmpty()) {
                System.out.println("Task cannot be empty!");
                continue;
            }

            if (tasks.contains(task)) {
                System.out.println("Task already exists!");
                continue;
            }

            tasks.add(task);
            System.out.println(task + " successfully added into your task.");
            break;
        }
    }

    public static void viewTask() {
        if (tasks.isEmpty()) {
            System.out.println("No available tasks yet.");
            return;
        }

        System.out.println("\nAll available tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void updateTask() {

        if (tasks.isEmpty()) {
            System.out.println("No available tasks yet.");
            return;
        }

        while (true) {
            System.out.println("\nChoose a task you want to update.");
            viewTask();
            int choice = getInput("Enter your choice: ");

            if (choice < 1 || choice > tasks.size()) {
                System.out.println("Invalid input. Pls try again.");
                continue;
            }

            System.out.print("Update new task: ");
            String update = scanner.nextLine().trim();

            if (update.isEmpty()) {
                System.out.println("Task cannot be empty!");
                continue;
            }

            if (tasks.contains(update) && !tasks.get(choice - 1).equals(update)) {
                System.out.println("Task already exists!");
                continue;
            }

            String oldTask = tasks.set(choice - 1, update);
            System.out.println("Task " + oldTask + " updated to " + update + ".");
            break;
        }

    }

    public static void removeTask() {

        if (tasks.isEmpty()) {
            System.out.println("No available task to remove.");
            return;
        }

        while (true) {
            System.out.println("\nChoose a task you want to remove.");
            viewTask();
            int choice = getInput("Enter your choice: ");

            if (choice < 1 || choice > tasks.size()) {
                System.out.println("Invalid input. Pls try again.");
                continue;
            }

            String removedTask = tasks.remove(choice - 1);
            System.out.println("Task " + removedTask + " removed successfully.");
            break;
        }
    }

    public static void clearTask() {
        if (tasks.isEmpty()) {
            System.out.println("No available tasks to clear.");
            return;
        }

        while (true) {
            System.out.print("Are you sure you want to clear all tasks? (Y/N): ");
            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("Y")) {
                tasks.clear();
                System.out.println("All tasks successfully removed.");
                break;
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("Operation cancelled.");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    public static void exit() {
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

            if (inputLine.equalsIgnoreCase("Y")) {
                System.out.println("Exiting...");
                System.exit(0);
            } else if (inputLine.equalsIgnoreCase("N")) {
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
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }
}
