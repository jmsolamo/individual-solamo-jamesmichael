package com.joysistvi.day14.math;

public class Activity11_Solamo {

    public static void main(String[] args) {

        //Math.abs() — Absolute value
        //Returns the positive value of a number.
        System.out.println("Absolute: " + Math.abs(-10));

        //Math.max() — Maximum value
        //Returns the larger of two values.
        System.out.println("Maximum: " + Math.max(5, 12));

        //Math.min() — Minimum value
        //Returns the smaller of two values.
        System.out.println("Minimum: " + Math.min(5, 12));

        //Math.pow() — Power (exponentiation)
        //Raises a number to a specified power. The result is a double.
        System.out.println("Power: " + Math.pow(2, 3));

        //Math.sqrt() — Square root
        //Returns the square root of a number.
        System.out.println("Square root: " + Math.sqrt(25));

        //Math.round() — Round to nearest integer
        //Rounds a number to the nearest whole number.
        System.out.println("Round: " + Math.round(4.7));

        //Math.ceil() — Round up (ceiling)
        //Rounds a number toward positive infinity. The result is a double.
        System.out.println("Ceiling: " + Math.ceil(4.2));

        //Math.floor() — Round down (floor)
        //Rounds a number toward negative infinity. The result is a double.
        System.out.println("Floor: " + Math.floor(4.9));

        //Math.random() — Random number
        //Returns a random double greater than or equal to 0.0 and less than 1.0.
        System.out.println("Random: " + Math.random());

        int randomNumber = (int)(Math.random() * 10) + 1;
        System.out.println(randomNumber);

        //Math.log() — Natural logarithm
        //Calculates the natural logarithm (base e) of a number.
        System.out.println("Natural log: " + Math.log(Math.E));

        //Math.log10() — Logarithm base 10
        //Calculates the logarithm with base 10.
        System.out.println("Log base 10: " + Math.log10(100));

        //Math.exp() — Exponential function
        //Calculates e^x where e is Euler's number
        System.out.println("Exponential: " + Math.exp(2));

        //Math.sin() — Sine
        //Calculates the sine of an angle in radians.
        System.out.println("Sine: " + Math.sin(Math.PI / 2));

        //Math.cos() — Cosine
        //Calculates the cosine of an angle in radians.
        System.out.println("Cosine: " + Math.cos(0));

        //Math.tan() — Tangent
        //Calculates the tangent of an angle in radians.
        System.out.println("Tangent: " + Math.tan(Math.PI / 4));

    }
}
