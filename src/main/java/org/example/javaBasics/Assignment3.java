package org.example.javaBasics;

import java.util.Scanner;

public class Assignment3 {

    private static final String validEmail = "mohamed@intrast.com"; // valid email
    private static final String validPassword = "Mohamed123"; // valid password
    public static boolean isLoggedIn = false; // login status
    public static boolean accountIsLocked = false; // account lock status
    public static int attemptCount = 0; // count of login attempts

    public static void main(String[] args) {
        // Login system
        // taking inputs
        Scanner input = new Scanner(System.in);

        while (!accountIsLocked && !isLoggedIn && attemptCount < 3) {

            System.out.println("Please enter your email:");
            String email = (input.nextLine().toLowerCase());
            System.out.println("Please enter your password:");
            String password = input.nextLine();

            // checking the inputs
            if (email.equals(validEmail) && password.equals(validPassword)) {
                isLoggedIn = true; // set login status to true
                attemptCount = 0; // reset attempt count on successful login
                System.out.println("Login successful!, Welcome "+ email);
            } else {
                attemptCount++; // increment attempt count
                isLoggedIn = false; // ensure login status is false
                System.out.println("Invalid credentials, you have "+(3 - attemptCount) +" attempts left.");
            }
        }
        if (attemptCount == 3) {
            accountIsLocked = true; // lock the account after 3 failed attempts
            isLoggedIn = false; // ensure login status is false
            System.out.println("Your account is locked due to too many failed login attempts.");
        }

        if (isLoggedIn && !accountIsLocked) {
            collectUserData();
            evaluateGrade();
        }


    }

    // method for User Information Collection:
    public static void collectUserData() {
        // code
    }
    // method for Grade Evaluation:
    public static void evaluateGrade() {
        // code
    }
    // method for Output:
    public static void displayOutput(){
        // code
    }
    public static void lockAccount() {
        accountIsLocked = true;
        isLoggedIn = false;

    }

// make password case-sensitive and email not
}
