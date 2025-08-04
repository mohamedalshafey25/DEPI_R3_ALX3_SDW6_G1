package org.example.OOP.Assignment6;

// Part 2: Abstraction (Abstract Class Shape)
// Provides a common base for all geometric shapes.
// It implements the Measurable interface, but because it's abstract,
// it doesn't have to implement getArea() and getPerimeter() itself.
// It passes that responsibility to its concrete subclasses.

public abstract class Shape implements Measurable {

    protected String name; // Common field for all shapes

    /**
     * Constructor for the Shape abstract class.
     * @param name The name of the shape (e.g., "Circle", "Rectangle").
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the shape.
     * This is a concrete method, common to all shapes.
     * @return The name of the shape.
     */
    public String getName() {
        return name;
    }

    // The abstract methods getArea() and getPerimeter() from the Measurable
    // interface are implicitly declared here as abstract because Shape is abstract.
    // They must be implemented by concrete subclasses.

}
