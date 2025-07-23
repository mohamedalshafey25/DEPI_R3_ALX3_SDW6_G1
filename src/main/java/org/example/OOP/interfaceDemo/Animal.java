package org.example.OOP.interfaceDemo;

public interface Animal {

    // Fields in interface
    // All fields in an interface are implicitly public, static, and final
    // No need to use the 'public static final' keywords
    String type = "Mammal"; // Example of a constant field


    // Abstract method (does not have a body)
    // All methods in an interface are implicitly public and abstract
    // No need to use the 'abstract' keyword

    void makeSound();
    void eat();

    // Concrete method (regular) is not allowed in the Interface:
/*
    void sleep(){
        System.out.println("Animal is sleeping");
    }
*/

    // Default methods can have a body, which allows adding new methods to interfaces
    default void run() {
        System.out.println("Animal is running");
    }


}
