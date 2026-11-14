package com.joysistvi.day27.program;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create an arraylist to store students objects
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101, "James Michael", "Biringan City", "09123456789"));
        employeeList.add(new Employee(102, "Allen", "Bocaue", "09123456788"));
        employeeList.add(new Employee(103, "Phoenix", "Caloocan City", "09123456787"));

        System.out.println("List of Employees: ");
        employeeList.forEach(employee ->
                System.out.println(employee.getName() )
        );
        //employeeList.forEach(System.out::println);

        System.out.println(employeeList);
    }
}
