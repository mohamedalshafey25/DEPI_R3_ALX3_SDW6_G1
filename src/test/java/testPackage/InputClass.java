package testPackage;

import java.util.Scanner;

public class InputClass {
    public static void main(String[] args) {

    // Taking Input from User
    System.out.println("Start!");
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your age:");
    int age = input.nextInt();
    input.nextLine();

    System.out.println("Your age is: " + age);

    System.out.println("Enter your name:");
    String name = input.nextLine();
    System.out.println("Your name is: " + name);

    System.out.println("End!");

}
}