package org.example;

import org.example.OOP.classesAndObjects.Student;

public class Main {
    public static void main(String[] args) {

        Student student1Ahmed = new Student("Mohamed",20, "high"); // Creating a new student object
//        student1Ahmed.setName("Ahmed"); // Setting the student's name
//        student1Ahmed.setAge(20); // Setting the student's age
//        student1Ahmed.age= 1; // Directly assigning the age attribute (not recommended, but possible due to public access modifier)

        student1Ahmed.setEducationLevel("Engineering"); // Setting the student's education level

        // Displaying the student's details
        System.out.println("Student Name: " + student1Ahmed.getName());
        System.out.println("Student Age: " + student1Ahmed.getAge());
        System.out.println("Student Education Level: " + student1Ahmed.getEducationLevel());



//        Student student1 = new Student("Ahmed", 20); // Creating a new student object
//        student1.displayStudentDetails(); // Displaying the student's details
//
//        Teacher teacher1 = new Teacher("Mr. Mohamed", 35); // Creating a new teacher object
//        teacher1.displayTeacherDetails(); // Displaying the teacher's details
    }
}