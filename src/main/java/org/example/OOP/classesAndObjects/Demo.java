package org.example.OOP.classesAndObjects;

public class Demo {
    public static void main(String[] args) {

        Student st1 = new Student("Mohamed", 20, "Engineering"); // Creating a new student object
//        System.out.println(st1.getName());
//        System.out.println(st1.getAge());
//        System.out.println(st1.getEducationLevel());


        Student st2 = new Student("Ahmed", 17);
        Student st3 = new Student("mody", 5); // Creating another student object
        System.out.println(st3.getEducationLevel());

//        Teacher t1 = new Teacher ("Alshafey","Testing");



    }
}
