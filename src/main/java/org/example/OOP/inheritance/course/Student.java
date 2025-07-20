package org.example.OOP.inheritance.course;

public class Student extends Person{
    // fields
    public String studentId;
    public char grade;

    // constructor for Student, calling superclass constructor
    public Student(String name, int age, String studentId, char grade) {
        super (name, age); // Calls Person's constructor

        this.studentId = studentId;
        this.grade = grade;
    }

    // methods
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + this.studentId + ", Grade: " + this.grade);
    }
    @Override
    public void celebrateBirthday() {
        super.celebrateBirthday();
        System.out.println(this.name +" with ID:  "+ this.studentId + " is now in grade " + this.grade + ".");
    }

    // Public method: Specific behavior for a student
    public void study() {
        System.out.println(this.name + " (ID: " + this.studentId + ") is studying.");
        System.out.println("");
    }

}
