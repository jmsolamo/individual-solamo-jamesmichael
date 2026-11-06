package com.joysistvi.day21.encap;

public class Ballpen {

    // data hiding -> making all the data members private
    private String brand;
    private String color;
    private double pointSize;
    private double weightInGrams;

    // special method / parameterized constructor

    public Ballpen(String brand, String color, double pointSize, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.pointSize = pointSize;
        this.weightInGrams = weightInGrams;
    }

    // String representation of object
    @Override
    public String toString() {
        return "Brand: " + brand + "\n" +
                "Color: " + color  + "\n" +
                "Point Size: " + pointSize + "\n" +
                "Weight in Grams: " + weightInGrams;
    }
}
