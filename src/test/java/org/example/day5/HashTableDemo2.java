package org.example.day5;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Map;

public class HashTableDemo2 {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<Integer, String> ht = new Hashtable<>();

        // Adding key-value pairs using put()
        ht.put(1, "Apple");
        ht.put(2, "Banana");
        ht.put(3, "Cherry");
        ht.put(4, "Date");

        // Displaying the Hashtable
        System.out.println("Initial Hashtable: " + ht);

        // Retrieving values using get()
        System.out.println("Value for key 2: " + ht.get(2));

        // Checking if a key exists using containsKey()
        System.out.println("Contains key 3? " + ht.containsKey(3));

        // Checking if a value exists using containsValue()
        System.out.println("Contains value 'Apple'? " + ht.containsValue("Apple"));

        // Getting the size of Hashtable
        System.out.println("Size of Hashtable: " + ht.size());

        // Removing a key-value pair using remove()
        ht.remove(4);
        System.out.println("After removing key 4: " + ht);

        // Checking if the Hashtable is empty
        System.out.println("Is Hashtable empty? " + ht.isEmpty());

        // Iterating over keys using keys() method
        System.out.println("Iterating over keys:");
        Enumeration<Integer> keys = ht.keys();
        while (keys.hasMoreElements()) {
            System.out.println("Key: " + keys.nextElement());
        }

        // Iterating over values using elements() method
        System.out.println("Iterating over values:");
        Enumeration<String> values = ht.elements();
        while (values.hasMoreElements()) {
            System.out.println("Value: " + values.nextElement());
        }

        // Iterating using entrySet()
        System.out.println("Iterating over key-value pairs:");
        for (Map.Entry<Integer, String> entry : ht.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Cloning a Hashtable
        Hashtable<Integer, String> clonedHt = (Hashtable<Integer, String>) ht.clone();
        System.out.println("Cloned Hashtable: " + clonedHt);

        // Clearing all elements
        ht.clear();
        System.out.println("Hashtable after clear(): " + ht);
    }
}

