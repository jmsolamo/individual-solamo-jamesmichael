package com.joysistvi.day24.interface_;

public class Cat extends Animal implements Pet {

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
    public void makeSound() {
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

    @Override
    public void play() {
        System.out.println(getName() + " chases a ball of yarn.");
    }

    @Override
    public void showAffection() {
        System.out.println(getName() + " purrs and rubs againts you.");
    }
}
