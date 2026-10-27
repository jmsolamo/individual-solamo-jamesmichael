package com.joysistvi.day11.singledarray;

import java.util.Scanner;

public class ArrayExampleWithSizeOnly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // syntax
        // datatype variable = new datatype[size]

        System.out.println("Enter 6 colors");
        String[] colors = new String[6];
        for (int i = 0; i < colors.length; i++){

            System.out.print("Enter 6 colors[" + (i + 1) + "]: ");
            colors[i] = sc.nextLine();
        }

        // Read After Write
        System.out.println("\nPrint all the colors");
        for (String color : colors){
            System.out.print(color + ", ");
        }
    }
}
