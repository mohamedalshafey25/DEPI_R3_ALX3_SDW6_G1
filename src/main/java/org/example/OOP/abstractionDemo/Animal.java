package org.example.OOP.abstractionDemo;

public abstract class Animal {

    // Constructor
    public Animal(){
        System.out.println("Animal constructor called");
    }


    // Abstract method (does not have a body)
    public abstract void makeSound();

    public abstract void eat();

    // Concrete method (regular)
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

}
