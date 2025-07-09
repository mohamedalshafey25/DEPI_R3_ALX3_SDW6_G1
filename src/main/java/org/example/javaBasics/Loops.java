package org.example.javaBasics;

public class Loops {
    public static void main(String[] args) {

        // For loop

        for(int i=1;i<=10;i++) {
            if(i==5){
                System.out.println("skipped "+i);
                continue;
            }
            System.out.println("This Statement was printed at the iteration : "+ i);
        }
        System.out.println("after loop");
        // While loop
/*
        int i=1;
        while (i<=10){
            System.out.println("This Statement was printed at the iteration : "+ i);
            i++;
        }
*/
        // Do While
/*
        int i = 1;
        do{
            System.out.println("This Statement was printed at the iteration : "+ i);
            i++;
        } while (i<=10);
*/



    }

}
