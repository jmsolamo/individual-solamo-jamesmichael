package com.joysistvi.day7.ifstatement;

public class IfElseStatement {
    public static void main(String[] args) {
        //Program that identify if age is valid or invalid
        int age = 18;

        //String result = (age >= 18) ? "Valid Age" : "Invalid Age";
        //System.out.println(result);

        String result = "";

        if (age >= 18){
            result = "Valid Age";
        }else{
            result = "Invalid Age";
        }
        System.out.println(result);
    }
}
