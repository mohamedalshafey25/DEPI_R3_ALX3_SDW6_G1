package org.example.OOP.abstractionDemo;

public class Cow extends Animal{

    // Constructor
    public Cow() {
        // Call the constructor of the superclass (Animal)
        super();
        System.out.println("Cow constructor called");
    }

    // Implementing the abstract method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating grass");
    }

    // Concrete method specific to Cow class
    public void produceMilk() {
        System.out.println("Cow is producing milk");
    }


}
