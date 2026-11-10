package com.joysistvi.day24.interface_;

public abstract class Animal {

    private String name;
    private int ageInMonths;

    public Animal(String name, int ageInMonths) {
        this.name = name;
        this.ageInMonths = ageInMonths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    // non-abstract method / regular method: shared by all animals
    public void eat() {

        System.out.println(name + " is eating.");
    }

    // abstract method: every child class must implement them
    public abstract void makeSound();

    @Override
    public String toString() {
        return
                "Name: " + name +
                "\nAgeInMonths: " + ageInMonths;
    }
}