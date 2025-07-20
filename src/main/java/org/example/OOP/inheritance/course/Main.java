package org.example.OOP.inheritance.course;

public class Main {
    public static void main(String[] args) {

        // Create instances of each class

        Person person1 = new Person("Ahmed",30);

        Admin admin1 = new Admin("Sarab",20, "A101", "Customer Service");
        Teacher teacher1 = new Teacher("Alshafey", 31, "T101", "SW_Testing");
        Student student1 = new Student("Mayar", 24, "S101", 'A');

        // Display information for each instance
        person1.displayInfo();
        admin1.displayInfo();
        teacher1.displayInfo();
        student1.displayInfo();
        System.out.println("-----------------------------------");

        // Celebrate birthdays
        person1.celebrateBirthday();
        admin1.celebrateBirthday();
        teacher1.celebrateBirthday();
        student1.celebrateBirthday();

        // Specific behaviors
        admin1.manage();
        teacher1.teach();
        student1.study();
/*
        // instanceof operator
        System.out.println(person1 instanceof Person);
        System.out.println(student1 instanceof Person);
        System.out.println(student1 instanceof Student);
*/
        // Instances of children classes
        UndergraduateStudent ugStudent1 = new UndergraduateStudent("Farida", 23, "UGS101", 'A', "Law", 4);
        GraduateStudent gStudent1 = new GraduateStudent("Ola", 26, "GS101", 'A', 2020);

        // methods for undergraduate student
        ugStudent1.displayInfo();
        ugStudent1.declareMajor();
        ugStudent1.celebrateBirthday();
        ugStudent1.study();

        // methods for graduate student
        gStudent1.displayInfo();
        gStudent1.declareGraduationYear();
        gStudent1.celebrateBirthday();
        gStudent1.study();



    }
}













