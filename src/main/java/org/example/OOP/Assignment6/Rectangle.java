package org.example.OOP.Assignment6;

// Rectangle.java
// Concrete class representing a rectangle, extending the abstract Shape class.

public class Rectangle extends Shape{

    private double length;
    private double width;

    /**
     * Constructor for the Rectangle class.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    public Rectangle(double length, double width) {
        super("Rectangle"); // Call superclass constructor with the shape name
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates and returns the area of the rectangle.
     * Implements the abstract getArea() method from the Measurable interface (via Shape).
     * Formula: length * width
     * @return The area of the rectangle.
     */
    @Override
    public double getArea() {
        return length * width;
    }

    /**
     * Calculates and returns the perimeter of the rectangle.
     * Implements the abstract getPerimeter() method from the Measurable interface (via Shape).
     * Formula: 2 * (length + width)
     * @return The perimeter of the rectangle.
     */
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Getter for the length.
     * @return The length of the rectangle.
     */
    public double getLength() {
        return length;
    }

    /**
     * Getter for the width.
     * @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }



}
