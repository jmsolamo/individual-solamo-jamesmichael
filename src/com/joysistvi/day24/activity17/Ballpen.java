package com.joysistvi.day24.activity17;

public class Ballpen extends Pen implements Refillable, Clickable{

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
    public void refill() {
        System.out.println("Replacing the ballpen ink refill.");
    }

    @Override
    public void click() {
        System.out.println(CLICK_SOUND + " The ballpen tip comes out.");
    }

    @Override
    public String toString() {
        return
                "Type: BallPen" + "\n" +
                super.toString() + "\n" +
                "Point Size: " + pointSize;
    }
}
