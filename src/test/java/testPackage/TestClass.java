package testPackage;

import org.testng.annotations.Test;

import java.util.Scanner;

public class TestClass {

    @Test
    public void testMethod1(){
        // if condition
        System.out.println("Start!");

        int age = 15;
        if (age >=18){
            System.out.println("You are an adult.");
        }
        System.out.println("End!");
    }

    @Test
    public void testMethod2(){
        // if-else condition
        System.out.println("Start!");

        int age = 25;
        if (age >=18){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        System.out.println("End!");
    }

    @Test
    public void testMethod3() {
        // if-else if-else condition
        System.out.println("Start!");

        // age>18 && score > 60 >> travel
        // age>18 && score <= 60 >> no travel
        // age<=18 && score > 60 >> money
        // age<=18 && score <= 60 >> no travel, no money

        // Student_1
        int age = 15;
        int score = 50;

        if (age>18 && score > 60) {
            System.out.println("Eligible for travel");
        } else if (age>18 && score <= 60) {
            System.out.println("No travel, score is low");
        } else if (age<18 && score > 60) {
            System.out.println("Eligible for money");
        } else if(age<18 && score < 60 ) {
            System.out.println("No travel, no money");
        } else {
            System.out.println("Invalid data");
        }
        System.out.println("End!");
    }

    @Test
    public void testMethod4() {
        // switch case
        System.out.println("Start!");

        int id = 1;
        switch (id) {
            case 1:
                System.out.println("Id = 1");
                System.out.println("Talk to TS");
                break;
            case 2:
                System.out.println("Id = 2");
                break;
            case 3:
                System.out.println("Id = 3");
                break;
            case 4:
                System.out.println("Id = 4");
                break;
            default:
                System.out.println("Id is not found");
                break;
        }
        System.out.println("End!");
    }

    @Test
    public void testMethod5() {

    }

}



