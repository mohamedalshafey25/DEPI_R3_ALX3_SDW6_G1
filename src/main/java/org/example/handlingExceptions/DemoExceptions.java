package org.example.handlingExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoExceptions {
    public static void main(String[] args) {

        // Scenario 1
//         This code will throw an ArrayIndexOutOfBoundsException
//         Handling exception
        int [] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println("Starting the program");
            numbers[5]= 20;
            System.out.println("Accessing index 5: " + numbers[5]);
            numbers[0]= 10; // This is a valid operation
            System.out.println("Accessing index 0: " + numbers[0]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of an exception.");
        }

        System.out.println("The code continue running"  );

        System.out.println("End of the program"  );


        // Scenario 2
//        System.out.println("Starting the program");
//
//        int sum= 5000;
//        int numberOfFoundResults = 0;
//
//        try {
//            int iphone17AveragePrice = sum/numberOfFoundResults;
//            System.out.println("The average price of iPhone 17 is: " + iphone17AveragePrice);
//
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException caught: " + e.getMessage());
//
//        } finally {
//            System.out.println("This block always executes, regardless of an exception.");
//        }
//
//        System.out.println("The code continue running"  );
//
//        System.out.println("End of the program"  );


//        // Scenario 3
        System.out.println("Starting the program");
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter Age: ");
            int age = input.nextInt();
            System.out.println("Enter Name: ");
            String name = input.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());

        } finally {
            input.close();
            System.out.println("Scanner closed.");
        }

        System.out.println("The code continue running"  );

        System.out.println("End of the program"  );
    }
}
