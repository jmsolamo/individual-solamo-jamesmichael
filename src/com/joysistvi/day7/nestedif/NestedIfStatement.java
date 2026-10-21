package com.joysistvi.day7.nestedif;

public class NestedIfStatement {

    public static void main(String[] args) {

        int age = 2;
        String category;
        String subCategory = "";

        if(age < 0 || age > 100){
            System.out.println("Invalid Age");
            return;
        }

        if (age >= 60) {
            category = "Senior";
            // 60 - 75 -> Young-old Senior
            // 76 - 100 -> Old Senior
            if(age >= 76){
                subCategory = "Old Senior";
            } else {
                subCategory = "Young-Old Senior";
            }

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
            // 0 - 1 -> Infant
            //2 -> Toddler

            if(age == 2 ){
                subCategory = "Toddler";
            } else {
                subCategory = "Infant";
            }
        }
        System.out.println("Category: " + category);
        System.out.println("SubCategory: " +subCategory);
    }
}