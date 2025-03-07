package org.example.day5;

import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;

public class VectorDemo {
    public static void main(String[] args) {
        // Creating a Vector with an initial capacity of 5
        Vector<String> vector = new Vector<>(5);

        // Adding elements using add()
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");

        // Adding element at specific index using add(index, element)
        vector.add(2, "Blueberry");

        // Displaying the Vector
        System.out.println("Vector: " + vector);

        // Getting an element by index using get()
        System.out.println("Element at index 2: " + vector.get(2));

        // Updating an element using set()
        vector.set(1, "Blackberry");
        System.out.println("After update: " + vector);

        // Removing an element by index using remove()
        vector.remove(3);
        System.out.println("After removing element at index 3: " + vector);

        // Removing an element by value using remove(Object)
        vector.remove("Apple");
        System.out.println("After removing 'Apple': " + vector);

        // Checking if an element exists using contains()
        System.out.println("Contains 'Cherry'? " + vector.contains("Cherry"));

        // Checking the size of the vector using size()
        System.out.println("Vector size: " + vector.size());

        // Checking the current capacity of the vector using capacity()
        System.out.println("Vector capacity: " + vector.capacity());

        // Finding the index of an element using indexOf()
        System.out.println("Index of 'Cherry': " + vector.indexOf("Cherry"));

        // Finding the last occurrence of an element using lastIndexOf()
        vector.add("Banana"); // Adding duplicate value
        System.out.println("Last index of 'Banana': " + vector.lastIndexOf("Banana"));

        // Cloning a Vector using clone()
        Vector<String> clonedVector = (Vector<String>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);

        // Iterating using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterating using ListIterator (Forward & Backward)
        System.out.println("Iterating using ListIterator (Forward):");
        ListIterator<String> listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Iterating using ListIterator (Backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Checking if Vector is empty using isEmpty()
        System.out.println("Is Vector empty? " + vector.isEmpty());

        // Clearing all elements using clear()
        vector.clear();
        System.out.println("Vector after clear(): " + vector);
    }
}

