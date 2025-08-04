package org.example.OOP.Assignment6;


// Part 1: Interface (Measurable)
// Defines a contract for any object that can provide its area and perimeter.

public interface Measurable {

    /**
     * Calculates and returns the area of the shape.
     * @return The area of the shape.
     */
    double getArea();

    /**
     * Calculates and returns the perimeter of the shape.
     * @return The perimeter of the shape.
     */
    double getPerimeter();

}
