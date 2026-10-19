package com.joysistvi.day4.operator;

public class Activity2_Solamo {
    public static void main(String[] args) {

        double income = 50000;
        System.out.println("Total Income: " +income);

        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        double foodAllowancePercentage = (foodAllowance / income) * 100;
        System.out.printf("Food Allowance: %.1f%%%n", foodAllowancePercentage);

        double transportationPercentage = (transportation / income) * 100;
        System.out.printf("Transportation: %.1f%%%n", transportationPercentage);

        double rentPercentage = (rent / income) * 100;
        System.out.printf("Rent: %.1f%%%n", rentPercentage);

        double utilityBillPercentage = (utilityBill / income)* 100;
        System.out.printf("Utility Bill: %.1f%%%n", utilityBillPercentage);

        double totalExpenses = foodAllowance + transportation
                + rent + utilityBill;

        double remainingBalance = income - totalExpenses;
        System.out.println("Remaining Balance: " +remainingBalance);
    }
}
