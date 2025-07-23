package org.example.OOP.abstractionDemo;

public class MainDemo {

    public static void main(String[] args) {
        Animal smallCow = new Cow(); // Upcasting to Animal type
        Cow bigCow = new Cow(); // Upcasting to Cow type

        smallCow.eat(); // Calls the eat method from Cow class
        smallCow.makeSound(); // Calls the makeSound method from Cow class
        smallCow.sleep(); // Calls the sleep method from Animal class

        bigCow.eat(); // Calls the eat method from Cow class
        bigCow.makeSound(); // Calls the makeSound method from Cow class
        bigCow.produceMilk(); // Calls the produceMilk method from Cow class
        bigCow.sleep(); // Calls the sleep method from Animal class

        Animal smallHorse = new Horse(); // Upcasting to Animal type
        Horse bigHorse = new Horse(); // Upcasting to Horse type

        smallHorse.eat(); // Calls the eat method from Horse class
        smallHorse.makeSound(); // Calls the makeSound method from Horse class
        smallHorse.sleep(); // Calls the sleep method from Animal class ((Reference type is Animal, but the actual object is Horse))

        bigHorse.eat(); // Calls the eat method from Horse class
        bigHorse.makeSound(); // Calls the makeSound method from Horse class
        bigHorse.race(); // Calls the race method from Horse class
        bigHorse.sleep(); // Calls the sleep method from Animal class ((Reference type is Horse, and the actual object is Horse))

    }




}
