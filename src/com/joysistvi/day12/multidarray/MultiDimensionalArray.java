package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        // coordinates: rows & columns
//        int[][] numbers = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//        // [rows], [columns]
//        //System.out.println(numbers[1][1]);
//
//        //System.out.println(numbers[0].length);
//
//        System.out.println("Traverse a multidimensional array using nested for loop");//
//        for (int rows = 0; rows < numbers.length; rows++) {
//            for (int columns = 0; columns < numbers[rows].length; columns++) {
//                System.out.println(numbers[rows][columns]);
//            }
//            System.out.println();
//        }
//
//        System.out.println("Traverse a multidimensional array using nested for each loop");//
//        for (int[] rows : numbers){
//            for (int columns : rows){
//                System.out.println(columns);
//            }
//            System.out.println();
//        }

        // Declare a multidimensional array with a specified size only

        String[][] planets = new String[2][5];

        for(int rows = 0; rows < planets.length; rows++){
            for (int columns = 0; columns < planets[rows].length; columns++){
                System.out.print("Enter planet[" + (rows + 1) + "][" + (columns + 1) + "]: ");
                planets[rows][columns] = scanner.nextLine();
            }
            System.out.println();
        }

        for (String[] rows : planets){
            System.out.print("[");
            for (String columns : rows){
                System.out.print(columns + " ");
            }
            System.out.println("]");
        }
    }
}