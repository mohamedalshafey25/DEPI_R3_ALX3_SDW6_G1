package org.example.collectionsDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet declaration
        Set<String> usernames = new HashSet<>();
        System.out.println("Initial size: " + usernames.size());

        // Adding elements to the HashSet
        usernames.add("Mohamed");
        usernames.add("Ahmed");
        usernames.add("Ali");
        System.out.println("Size after adding elements: " + usernames.size());

        // Attempting to add a duplicate element
        usernames.add("Mohamed");
        System.out.println("Size after adding duplicate: " + usernames.size());

        // Checking if an element exists
        System.out.println("Contains 'Ahmed': " + usernames.contains("Ahmed"));
        System.out.println("Contains 'Mona': " + usernames.contains("Mona"));

        // Removing an element
        usernames.remove("Ali");

        // Iterating through the HashSet
        for (String username : usernames) {
            System.out.println("Username: " + username);
        }


    }
}
