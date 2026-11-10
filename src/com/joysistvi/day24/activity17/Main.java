package com.joysistvi.day24.activity17;

public class Main {

    public static void main(String[] args) {

        // Pen pen = new Pen("Generic", "Blue", 20);
        // This fails because Pen is an abstract class and cannot be instantiated directly.
        // We need to create an object of a concrete subclass, such as Ballpen or Highlighter.

        Ballpen ballpen = new Ballpen("Pilot", "Black", 10, 0.5);
        Highlighter highlighter = new Highlighter("Faber Castell", "Green", 20, "Neon");

        System.out.println("=== testPen() ===");
        System.out.println(ballpen);
        ballpen.write();
        ballpen.store();

        System.out.println("\n" + highlighter);
        highlighter.write();
        highlighter.store();

        System.out.println("\n=== testRefillable() ===");
        testRefillable(ballpen);
        testRefillable(highlighter);

        System.out.println("=== testClickable() ===");
        testClickable(ballpen);
    }

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.store();
    }

    public static void testRefillable(Refillable refillable) {
        refillable.refill();
        System.out.println("Maximum refills: " + Refillable.MAX_REFILLS + "\n");
    }

    public static void testClickable(Clickable clickable) {
        clickable.click();
    }


}