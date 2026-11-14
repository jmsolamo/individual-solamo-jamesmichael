package com.joysistvi.day27.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapCrud {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        students.put(2026001, "James Michael");
        students.put(2026002, "Neil Jay");
        students.put(2026003, "Mark Daniel");

        System.out.println("Student 2026002: " + students.get(2026002));

        students.put(2026002, "Cedric Manito");
        System.out.println("Updated 2026002: " + students.get(2026002));

        int searchId = 2026001;
        if (students.containsKey(2026001)) {
            System.out.println(searchId + " is Enrolled.");
        }else {
            System.out.println(searchId + " is not found.");
        }

        students.remove(2026003);
        //Set set = students.keySet();
        System.out.println("\nEnrolled Student List: ");
        for (int id : students.keySet()) {
            System.out.println(id + " - " + students.get(id));
        }

        students.forEach((id, name) -> {
            System.out.println(id + " : " + name);
        });
    }
}