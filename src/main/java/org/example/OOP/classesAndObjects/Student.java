package org.example.OOP.classesAndObjects;

public class Student {

    private String name;    // Student's name
    private int age;       // Student's age
    private String educationLevel; // Student's education level

    // Parameterized constructor
    public Student (String name, int age, String educationLevel) {
        this.name = name;
        this.age = age;
        this.educationLevel = educationLevel;
    }

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Setter Methods to assign values to the attributes
    public void setName(String name) {
        this.name = name;  // Assigning the name
    }
    public void setAge(int age) {
        // add age validation to be > 18 years old
        if (age < 18) {
            System.out.println("Age must be greater than or equal to 18.");
        }
        else {
            this.age = age; // Assigning the age if validation passes

        }
    }
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel; // Assigning the education level
    }

    // Getter Methods to retrieve values of the attributes
    public String getName() {
        return name;  // Returning the name
    }
    public int getAge() {
        return age;    // Returning the age
    }
    public String getEducationLevel() {
        return educationLevel; // Returning the education level
    }

    // Additional method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Education Level: " + educationLevel);
    }

}
