package com.joysistvi.day25.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCrud {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        // Create / Add items
        colors.add("Red");
        // White
        colors.add("Blue");
        colors.add("Green");
        colors.add(1,"White");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Yellow");
        //System.out.println(colors);

        // Read / Get items
        System.out.println(colors.get(0));

        // Update / Set item(s)
        System.out.println(colors.set(0,"Wred"));

        // Delete / Remove an item(s)
        colors.remove(0);
        //System.out.println(colors);

        colors.remove("Green");
        //System.out.println(colors);

        // Remove all items in the List
        colors.removeAll(colors);
        //System.out.println(colors);

        colors.clear();
        //System.out.println(colors);

        // Get size
        System.out.println(colors.size());

        // Traverse an arraylist using for-loop
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Traveres an arraylist using for-each loop
        for (String color : colors) {
            System.out.println(color);
        }

        // Traveres an arraylist using easiest way

        // Sorting
        Collections.sort(colors);
        System.out.println("\nsort");
        colors.forEach(System.out::println);

        // Shuffle
        Collections.shuffle(colors);
        colors.forEach(System.out::println);
        System.out.println();

        // Contains()
        System.out.println(colors.contains("Black"));

        // indexOf()
        System.out.println(colors.indexOf("Yellow")); // return of the first occurrence
        System.out.println(colors.lastIndexOf("Yellow")); // return of the last occurence

    }
}