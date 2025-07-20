package org.example.OOP.inheritance.course;

public class GraduateStudent extends Student{

    // fields
    public int graduationYear;

    // Constructor for GraduateStudent, calling superclass constructor
    public GraduateStudent(String name, int age, String studentId, char grade, int graduationYear) {
        super(name, age, studentId, grade);
        this.graduationYear = graduationYear;
    }
    // methods
            // Will not override the grandparent's method (displayInfo() )

    // override direct parent's method (study() )
    @Override
    public void study() {
        super.study();
        System.out.println(this.name +" graduated in " + this.graduationYear + ".");
    }

    // specific method for GraduateStudent
    public void declareGraduationYear() {
        System.out.println(this.name + " has graduated in " + this.graduationYear + " .");
        System.out.printf("The person %s has graduated in %d , in age %d %n.%n.",this.name, this.graduationYear, this.age  );
    }

}
