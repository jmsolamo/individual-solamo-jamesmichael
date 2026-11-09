package com.joysistvi.day23.polymorphism.methodoverriding;

public class Cat extends Animal {

    private String furColor;

    public Cat(String name, int ageInMonths, String furColor) {
        super(name, ageInMonths);
        this.furColor = furColor;
    }

    public Cat(String name, int ageInMonths) {
        super(name, ageInMonths);
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makesSound() {
        System.out.println(getName() + " says: Meow! Meow!");
    }

    public void scratch() {
        System.out.println(getName() + " is scratching the sofa.");
    }

    @Override
    public String toString() {
        return "Type: Cat\n"
                + super.toString() + "\n"
                + "Furcolor: " + furColor;
    }
}
