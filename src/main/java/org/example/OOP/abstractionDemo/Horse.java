package org.example.OOP.abstractionDemo;

public class Horse extends Animal{

    // Implementing the abstract method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Neigh");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating hay");
    }

    // Concrete method specific to Horse class
    public void race() {
        System.out.println("Horse is racing");
    }

    // Override sleep() method if needed
    @Override
    public void sleep() {
        System.out.println("Horse is sleeping");
    }

}
