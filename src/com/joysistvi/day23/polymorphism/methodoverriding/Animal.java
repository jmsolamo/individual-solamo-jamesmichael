package com.joysistvi.day23.polymorphism.methodoverriding;

public class Animal {

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

    public void eat() {

        System.out.println(name + " is eating.");
    }


    public void makesSound() {
        System.out.println(name + " make a sound");
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                "\nAgeInMonths: " + ageInMonths;
    }
}