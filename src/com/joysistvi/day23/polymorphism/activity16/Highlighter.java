package com.joysistvi.day23.polymorphism.activity16;

public class Highlighter extends Pen {

    private String inkType;

    public Highlighter(String brand, String color, double weightInGrams, String inkType) {
        super(brand, color, weightInGrams);
        this.inkType = inkType;
    }

    public Highlighter(String brand, String color, double weightInGrams) {
        super(brand, color, weightInGrams);
    }

    public String getInkType() {
        return inkType;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    @Override
    public void write() {
        System.out.println("Highlight the text with a highlighter.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the highlighter ink.");
    }

    @Override
    public String toString() {
        return
                "\nType: Highlighter" + "\n" +
                super.toString() + "\n" +
                "Ink Type: " + inkType;
    }
}
