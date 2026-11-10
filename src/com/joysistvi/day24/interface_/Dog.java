package com.joysistvi.day24.interface_;

public class Dog extends Animal implements Pet, Swimmer{

    private String breed;

    public Dog(String name, int ageInMonths, String breed) {
        super(name, ageInMonths);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // implementing the abstract methods for animal
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }

    @Override
    public String toString() {
        return "Type: Dog\n" +
                super.toString() + "\n" +
                "Breed: " + breed;
    }

    @Override
    public void play() {
        System.out.println(getName() + " plays fetch.");
    }

    @Override
    public void showAffection() {
        System.out.println(getName() + " wags its tail happily.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims in the river.");
    }
}