package testPackage;

import java.util.Scanner;

public class MethodsDemo {

    static String message;
    static char grade;
    static String name;
    static int age;

    public static void main(String[] args) {
      MethodsDemo.takeInput();
      System.out.println("Your grade is: " + calculateGrade(85));
      printOutput();
      getMessage(grade);
    }

    public static void takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your name:");
        name = input.nextLine();
    }

    public static char calculateGrade(int score){
        if (score<60){
            grade = 'F';    // F
        } else if (score>=60 && score<70){
            grade = 'D';   // D
        } else if (score>=70 && score<80){
            grade = 'C';   // C
        } else if (score>=80 && score<90){
            grade = 'B';   // B
        } else if (score>=90 && score<=100){
            grade = 'A';   // A
        } else {
            grade = '0';// invalid grade
        }
        return grade;
    }

    public static void printOutput() {
        System.out.println("Age: " + age);
        System.out.println("Name : " + name);
        System.out.println("Grade: " + grade);
        System.out.println(message);
    }

    public static String getMessage(char grade) {
        switch (grade) {
            case 'A':
                message = "Excellent work!";
                break;
            case 'B':
                message = "Great job!";
                break;
            case 'C':
                message = "Good effort!";
                break;
            case 'D':
                message = "You passed, but aim higher.";
                break;
            case 'F':
                message = "You need to improve.";
                break;
            default:
                message = "Invalid Grade";
        }
        return message;
    }

}
