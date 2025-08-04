package org.example.collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        // ArrayList declaration
        List<String> shoppingList = new ArrayList<>();
        System.out.println(shoppingList.size());

        // Adding elements to the ArrayList
        shoppingList.add("Mobile");
        shoppingList.add("Laptop");
        shoppingList.add("Tablet");
        System.out.println(shoppingList.size());

        // Access elements by index
        System.out.println(shoppingList.get(0));
        System.out.println(shoppingList.getFirst());
        System.out.println(shoppingList.getLast());

        // Iterating through the ArrayList
        for (String shopingItem : shoppingList) {
            System.out.println("Item " + shopingItem);
        }

        // Removing an element
        shoppingList.remove(0);
        System.out.println("After removing an item: " + shoppingList.size());

        // check if element exists
        System.out.println("Mobile "+ shoppingList.contains("Laptop"));
        System.out.println("Charger "+ shoppingList.contains("Charger"));

    }
}
