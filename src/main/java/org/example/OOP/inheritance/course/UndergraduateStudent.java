package org.example.OOP.inheritance.course;

public class UndergraduateStudent extends Student{

    // fields
    public String major;
    public int year;

    // Constructor for UndergraduateStudent, calling superclass constructor
    public UndergraduateStudent (String name, int age, String studentId, char grade, String major, int year){
        super(name, age, studentId, grade); // Calls Student's constructor
        this.major = major;
        this.year = year;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() { // Change all implementation for the method without using super
        System.out.println("Undergraduate Student: "+ this.major + " in year " + this.year);
    }

    // specific method for UndergraduateStudent
    public void declareMajor() {
        System.out.println(this.name + " is in major " + this.major + " in year "+ this.year + ".");
    }

}
