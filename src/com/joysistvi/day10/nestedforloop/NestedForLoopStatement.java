package com.joysistvi.day10.nestedforloop;

public class NestedForLoopStatement {

    public static void main(String[] args) {

        // syntax of nested for loop

        for (int i = 1; i <= 3; i++){ // outer loop

            for (int j = 1; j <= 3; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
