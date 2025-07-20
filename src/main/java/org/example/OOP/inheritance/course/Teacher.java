package org.example.OOP.inheritance.course;

public class Teacher extends Person{
    // fields
    public String teacherId;
    public String subject;

    // Constructor for Teacher, calling superclass constructor
    public Teacher (String name, int age , String teacherId, String subject) {
        super(name, age);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    // methods
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + this.teacherId + ", Subject: " + this.subject);
    }
    @Override
    public void celebrateBirthday() {
        super.celebrateBirthday();
        System.out.println(this.name +" with ID:  "+ this.teacherId + " is now teaching " + this.subject + ".");

    }

    // Public method: Specific behavior for a teacher
    public void teach() {
        System.out.println(this.name + " (EmpID: " + this.teacherId + ") is teaching " + this.subject + ".");
        System.out.println("");
    }

}
