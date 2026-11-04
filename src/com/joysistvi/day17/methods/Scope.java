package com.joysistvi.day17.methods;

public class Scope {

    static String name = "Winter"; // static variable / class variable
    int age = 60; // instance variable

    public static void main(String[] args) {

        int num = 0; // local variable

        System.out.println(num);

        Scope obj = new Scope();
        System.out.println(obj.age);

    }

    public static void greet() {

        System.out.println(name);

    }

    public static void scope() {

        while (true) {
            int count = 0; // block scope
        }

    }

    // Static Method
    public static int sum(int a, int b) {

        return a + b;

    }

    int num = 0;

    public void a() {

    }

    public void b() {

        System.out.println(this.num);
        this.a();

    }

    //Instance Method
    public int product(int a, int b) {

        return a * b;

    }

    // Easy Memory Trick
    /*
        static to static - direct
        static to instance - direct
        instance to static - instantiate
        instance to instance - direct
     */
    // static -> belongs to the class
    // instance -> belongs to the instance/object

}
