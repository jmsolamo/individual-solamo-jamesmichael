package com.joysistvi.day22.inheritance.activity15;

public class Ballpen extends Pen{

    private Double pointSize;

    public Ballpen(String brand, String color, double weightInGrams, double pointSize) {
        super(brand, color, weightInGrams);
        this.pointSize = pointSize;
    }

    public Ballpen(String brand, String color, double weightInGrams) {
        super(brand, color, weightInGrams);
    }

    public double getPointSize() {
        return pointSize;
    }

    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }

    @Override
    public String toString() {
        return
                super.toString() + "\n" +
                "Point Size: " + pointSize;
    }
}
