package org.example.OOP.Assignment6;

// Part 4: Main Application (ShapeCalculatorDemo)
// Demonstrates the use of interfaces, abstract classes, and polymorphism.

import java.util.ArrayList;
import java.util.List;

public class ShapeCalculatorDemo {

    public static void main(String[] args) {
        System.out.println("--- Geometric Shape Calculator Demo ---");

        // Create instances of concrete shape classes
        Circle circle1 = new Circle(5.0);
        Rectangle rectangle1 = new Rectangle(4.0, 6.0);
        Circle circle2 = new Circle(2.5);

        // Create a List of Measurable objects (demonstrates polymorphism)
        // We can store different types of shapes in a single list because
        // they all implement the Measurable interface.
        List<Measurable> shapes = new ArrayList<>();
        shapes.add(circle1);
        shapes.add(rectangle1);
        shapes.add(circle2);

        System.out.println("\n--- Calculating Area and Perimeter for Various Shapes ---");

        // Iterate through the list of Measurable objects
        for (Measurable shape : shapes) {
            // We can call getName() because Shape is the common abstract superclass
            // and getName() is a concrete method in Shape.
            // We need to cast to Shape to access getName(), or add getName() to Measurable.
            // For simplicity, let's assume we know they are Shapes, or add getName() to Measurable.
            // For this example, let's cast to Shape for getName() as it's not in Measurable.
            // A more robust design might put getName() in Measurable if all measurable things have names.
            String shapeName = "";
            if (shape instanceof Shape) {
                shapeName = ((Shape) shape).getName();
            } else {
                shapeName = "Unknown Measurable";
            }

            System.out.println("\nShape: " + shapeName);
            // Polymorphism in action: The specific getArea() and getPerimeter()
            // methods (Circle's or Rectangle's) are called at runtime based on the
            // actual object type.
            System.out.printf("  Area: %.2f%n", shape.getArea());
            System.out.printf("  Perimeter: %.2f%n", shape.getPerimeter());
        }

        System.out.println("\n--- Specific Shape Details ---");
        // You can still access specific fields/methods after downcasting (with instanceof for safety)
        if (circle1 instanceof Circle) {
            Circle c = (Circle) circle1;
            System.out.println("Circle 1 Radius: " + c.getRadius());
        }

        if (rectangle1 instanceof Rectangle) {
            Rectangle r = (Rectangle) rectangle1;
            System.out.println("Rectangle 1 Length: " + r.getLength() + ", Width: " + r.getWidth());
        }

        System.out.println("\n--- End of Demo ---");
    }


}
