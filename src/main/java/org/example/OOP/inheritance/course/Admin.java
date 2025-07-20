package org.example.OOP.inheritance.course;

public class Admin extends Person{
    // fields
    public String adminId;
    public String department;

    // constructor for Admin, calling superclass constructor
    public Admin (String name, int age, String adminId, String department){
        super(name, age);
        this.adminId = adminId;
        this.department = department;
    }
    //methods
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admin ID: " + this.adminId + ", Department: " + this.department);
    }
    @Override
    public void celebrateBirthday() {
        super.celebrateBirthday();
        System.out.println(this.name +" with ID:  "+ this.adminId + " is now managing the " + this.department + " department.");

    }
    // Public method: Specific behavior for an admin
    public void manage() {
        System.out.println(this.name + " (AdminID: " + this.adminId + ") is managing the " + this.department + " department.");
        System.out.println("");
    }
}
