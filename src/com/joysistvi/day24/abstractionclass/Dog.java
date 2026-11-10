package com.joysistvi.day24.abstractionclass;

public class Dog extends Animal {

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
    public void makesSound() {
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

}