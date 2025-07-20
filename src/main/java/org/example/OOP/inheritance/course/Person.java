package org.example.OOP.inheritance.course;

public class Person {
    // Public field: Accessible from anywhere
    public String name;
    public int age;

    // parameterized Constructor for the Person class
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    // methods
    public void displayInfo() {
        System.out.println("");
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
    public void celebrateBirthday() {
        this.age++;
        System.out.println("");
        System.out.println(this.name + " is now " + this.age + " years old! Happy Birthday!");
    }

}
