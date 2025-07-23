package org.example.OOP.polymorphism;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }

}
