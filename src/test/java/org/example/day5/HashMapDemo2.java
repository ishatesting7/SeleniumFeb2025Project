package org.example.day5;
import java.util.Hashtable;

public class HashMapDemo2 {

        public static void main(String[] args) {
            Hashtable<String, Integer> students = new Hashtable<>();

            // Adding elements
            students.put("Alice", 85);
            students.put("Bob", 92);
            students.put("Charlie", 78);

            // Retrieving a value
            System.out.println("Alice's Score: " + students.get("Alice"));

            // Checking if a key exists
            System.out.println("Contains key 'Bob'? " + students.containsKey("Bob"));

            // Checking if a value exists
            System.out.println("Contains value 78? " + students.containsValue(78));

            // Removing a key-value pair
            students.remove("Charlie");
            System.out.println("After removing Charlie: " + students);

            // Iterating over keys and values
            System.out.println("Students and Scores:");
            for (String key : students.keySet()) {
                System.out.println(key + " -> " + students.get(key));
            }
        }
/*

Feature
                Hashtable	                    HashMap
Synchronization	✅ Yes (Thread-safe)	❌ No
Null Keys	    ❌ Not Allowed	        ✅ Allowed (Only one)
Null Values	    ❌ Not Allowed	        ✅ Allowed
Performance	    ❌ Slower (due to synchronization)	✅ Faster

 */


}
