package com.joysistvi.day23.polymorphism.activity16;

public class Main {

    public static void main(String[] args) {
        Pen pen = new Pen("Generic", "Blue", 20);
        Ballpen ballpen = new Ballpen("Pilot", "Black", 10, 0.5);
        GelPen gelpen = new GelPen("G-Tech", "Blue", 15, 0.7, true);
        Highlighter highlighter = new Highlighter("Faber Castell", "Green", 20, "Neon");

        System.out.println("=== Calling methods on Pen references ===");
        System.out.println("--- Pen ---");
        pen.write();
        pen.refill();

        System.out.println("\n--- BallPen ---");
        ballpen.write();
        ballpen.refill();

        System.out.println("\n--- GelPen ---");
        gelpen.write();
        gelpen.refill();

        System.out.println("\n--- Highlighter ---");
        highlighter.write();
        highlighter.refill();

        System.out.println("\n=== testPen() ===");
        testPen(pen);
        System.out.println("\nType: BallPen");
        testPen(ballpen);
        testPen(gelpen);
        testPen(highlighter);

        System.out.println("\n=== Overloading ===");
        gelpen.write("Hello");
        gelpen.write("Hello", 3);

    }

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.refill();
    }

}

    // Method Overloading (Compile-Time): Multiple methods have the same name but different parameters.
    // Java determines which overloaded method to execute during compile time.
    // Method Overriding (Runtime): A child class provides its own implementation of an inherited method.
    // Java determines which overridden method to execute during runtime based on the actual object.
