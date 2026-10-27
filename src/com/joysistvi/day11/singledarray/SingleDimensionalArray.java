package com.joysistvi.day11.singledarray;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        //syntax
        // age 24, 26, 30, 38, 17

        int []ages = { 24, 26, 30, 38, 17 };

        // invoke an element
        System.out.println(ages[2]);

        // get the length of the array
        System.out.println(ages.length);

        // traverse an array using for-loop
        for (int i = 0; i < ages.length;  i++){
              if(i == 4) {
                  break;
            }
            System.out.println(ages[i]);
        }

        //for-each loop // enhance for-loop
        for (int age : ages) {
            System.out.println(age);
        }

    }
}
