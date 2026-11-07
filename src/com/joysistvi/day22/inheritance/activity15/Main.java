package com.joysistvi.day22.inheritance.activity15;

public class Main {

    public static void main(String[] args) {
        Pen pen = new Pen("Any Brand", "Any Color", 20);
        Ballpen ballpen = new Ballpen("G-Tech", "Black", 10, 0.5);
        GelPen gelpen = new GelPen("Pilot", "Blue", 15, 0.7, true);
        Highlighter highlighter = new Highlighter("Faber Castell", "Green", 20, "Neon");

        System.out.println("========= Ballpen =========");
        System.out.println("Type: Ballpen");
        System.out.println(ballpen);
        ballpen.write();

        System.out.println("\n========= GelPen =========");
        System.out.println(gelpen);
        gelpen.write();

        System.out.println("\n========= Highlighter =========");
        System.out.println(highlighter);
        highlighter.write();
    }
}
