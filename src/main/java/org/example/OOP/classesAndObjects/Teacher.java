package org.example.OOP.classesAndObjects;

public class Teacher {
    // Attributes of the Teacher class
    String name;    // Teacher's name
    String subject;       // Teacher's age

    // Constructor to initialize the Teacher object
    public Teacher(String name, String subject) {
        this.name = name;  // Assigning the name
        this.subject = subject;    // Assigning the subject
    }

    // Method to display teacher details
    public void displayTeacherDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Subject: " + subject);
    }

}
