package org.example.collectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {


        // HashMap declaration
        Map<String, String> phoneBook = new HashMap<>();

        // Get initial size
        System.out.println("Initial size: " + phoneBook.size());
        // Adding elements to the HashMap
        phoneBook.put("Mohamed Alshafey", "01062124645");
        phoneBook.put("Hossam Eldin", "01234567890");
        phoneBook.put("Ahmed Mohamed", "01122334455");

        // Get size after adding elements
        System.out.println("After adding size: " + phoneBook.size());

        // Get phone number using the key
        System.out.println("Mohamed Alshafey: "+ phoneBook.get("Mohamed Alshafey"));
        System.out.println("Hossam Eldin: "+ phoneBook.get("Hossam Eldin"));
        System.out.println("Ahmed Mohamed: "+ phoneBook.get("Ahmed Mohamed"));

        // Check if a key exists
        System.out.println("Farida  : "+ phoneBook.containsKey("Farida"));
        System.out.println("Hossam Eldin: "+ phoneBook.containsKey("Hossam Eldin"));

        // Check if a value exists
        System.out.println("01062124645: "+ phoneBook.containsValue("01062124645"));
        // get the key of value

        for (String key : phoneBook.keySet()){
            System.out.println("Key: " + key + ", Value: " + phoneBook.get(key));
        }
        // Removing an element by key
        phoneBook.remove("Mohamed Alshafey");

        // Removing an element by value
        phoneBook.values().remove("01234567890");

    }
}
