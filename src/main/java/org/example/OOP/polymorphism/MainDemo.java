package org.example.OOP.polymorphism;

public class MainDemo {
    public static void main(String[] args) {


        // Create an instance of Dog
        Dog dog1 = new Dog();
        // Call the overridden method
        dog1.makeSound();
        // Call the specific method of Dog
        dog1.fetch();

        // Create an instance of Animal
        Animal dog2 = new Dog();
        // Call the overridden method using Animal reference
        dog2.makeSound();
        // The following line would cause a compile-time error because
        // Animal reference cannot access Dog's specific method
//         dog2.fetch(); // Uncommenting this line will cause an error

        // Create an instance of Animal
        Animal animal = new Animal();
        // Call the method of Animal
        animal.makeSound();


/*
        // type casting from char to int example
        char c = 'A';
        System.out.println(c);
        System.out.println((int) c);
*/

    }
}