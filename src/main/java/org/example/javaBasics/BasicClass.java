package org.example.javaBasics;

public class BasicClass {
    public static void main(String[] args) {


        // ##Comments
        // This is a single line comment

    /*
        This is a multi-line comment.
        It can span multiple lines.
    */
// ##Variables
        int age;                 // Variable declaration
        age = 30;               // Variable initialization // Assigning value to the variable
        System.out.println("age 1st time" + age);    // variable calling
        int person_age = 30;    // Variable declaration and initialization in one line
        age = 50;               // Variable assignation
        System.out.println("age 2nd time" + age);

        String firstName = "Mohamed";

// ## Naming Conventions
        // camelCase >> variables , packages, methods
        // PascalCase >> classes

        // ## constant variables
        final int id = 10720; // final >> constant variable, cannot be changed after initialization
        // id = 100; // This line will cause an error because 'id' is a final variable and cannot be reassigned.

// ## Operators

        // arithmetic operators
        // + - * / %

        // increment and decrement operators
        int count = 0;
        count++; // Increment by 1
        //count = count + 1; // Another way to increment by 1

        count--; // Decrement by 1
        //count = count - 1; // Another way to decrement by 1


        // assignment operators
        count = 10; // Assigning a value to count
        count -= 5; // Decrement by 1 using compound assignment
        count += 11; // Increment by 1 using compound assignment
        count *= 2; // Multiply by 2 using compound assignment
        count /= 2; // Divide by 2 using compound assignment
        count %= 3; // Modulus operation, gives the remainder when count is divided by 3

        // comparison operators
        boolean isEqual = (count != 10); // Checks if count is equal to 10 // ==, !=, >, <, >=, <=

        // logical operators
        boolean isTrue = true;
        boolean isFalse = false;
        boolean result = isTrue && isFalse; // Logical AND
        result = isTrue || isFalse; // Logical OR
        result = !isTrue; // Logical NOT, negates the value of isTrue

        boolean userAge = false;
        boolean userSalary = true;
        boolean isValidForRegisteration = userAge || userSalary; // &&
        System.out.println((isValidForRegisteration));


    }
}
