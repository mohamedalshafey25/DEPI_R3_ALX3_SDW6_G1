package org.example.javaBasics;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        // Inputs from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String studentName = input.nextLine();

        System.out.println("Enter marks for subject1: "); // mark 1
        int subject1Marks = input.nextInt();
        input.nextLine();
        System.out.println("Enter marks for subject2: "); // marks 2
        int subject2Marks = input.nextInt();
        input.nextLine();
        System.out.println("Enter marks for subject3: "); // mark 3
        int subject3Marks = input.nextInt();
        input.nextLine();

        // Calculations
        int totalMarks = subject1Marks + subject2Marks + subject3Marks; // total Marks
        float averageMarks = totalMarks / 3; // Average MArks

        // Grade identification
        char grade;
        if (averageMarks<60){
            grade = 'F';    // F
        } else if (averageMarks>=60 && averageMarks<70){
            grade = 'D';   // D
        } else if (averageMarks>=70 && averageMarks<80){
            grade = 'C';   // C
        } else if (averageMarks>=80 && averageMarks<90){
            grade = 'B';   // B
        } else if (averageMarks>=90 && averageMarks<=100){
            grade = 'A';   // A
        } else {
            grade = '0';// invalid grade
        }
        // Switching the Grade to print message
        String message;
        switch (grade){
            case 'A':
                message="Excellent work!";
                break;
            case 'B':
                message="Great job!";
                break;
            case 'C':
                message="Good effort!";
                break;
            case 'D':
                message="You passed, but aim higher.";
                break;
            case 'F':
                message="You need to improve.";
                break;
            default:
                message="Invalid Grade";
        }

        // Printing Output
        System.out.println("Student: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println(message);

    }

}
