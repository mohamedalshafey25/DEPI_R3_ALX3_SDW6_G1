package org.example.OOP.Assignment6;

// Part 3: Concrete Implementations

// Circle.java
// Concrete class representing a circle, extending the abstract Shape class.

public class Circle extends Shape{

    private double radius;

    /**
     * Constructor for the Circle class.
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        super("Circle"); // Call superclass constructor with the shape name
        this.radius = radius;
    }

    /**
     * Calculates and returns the area of the circle.
     * Implements the abstract getArea() method from the Measurable interface (via Shape).
     * Formula: pi * r^2
     * @return The area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates and returns the perimeter (circumference) of the circle.
     * Implements the abstract getPerimeter() method from the Measurable interface (via Shape).
     * Formula: 2 * pi * r
     * @return The perimeter of the circle.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Getter for the radius.
     * @return The radius of the circle.
     */
    public double getRadius() {
        return radius;
    }


}
