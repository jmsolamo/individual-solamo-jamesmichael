package com.joysistvi.day10.jumpstatement;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++){
            System.out.println(i);

            if (i == 5){
                break;
            }
        }
    }
}

/*

    Good to Remember:

    break; stop the loop completely.
    continue; skip the round, but keep looping
 */