package org.example.day5;

import java.util.Hashtable;

public class HashTableDemo {

    /*
    No null Key/Value
     */
    public static void main(String args[])
    {
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("Jan", 1);
        ht.put("Feb", 2);
        ht.put("Feb", 2);

        //ht.put(null, null);
        System.out.println(ht.size());
        System.out.println(ht);
        boolean hasKey = ht.containsKey("Jan");
        System.out.println(hasKey);

    }
}
