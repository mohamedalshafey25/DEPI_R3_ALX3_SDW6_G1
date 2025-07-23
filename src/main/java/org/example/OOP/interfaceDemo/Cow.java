package org.example.OOP.interfaceDemo;

public class Cow implements Animal {

    // implementing the abstract method from Animal interface
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
    @Override
    public void eat() {
        System.out.println("Cow is eating grass");
    }


}
