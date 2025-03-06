package org.example.day5;

import java.util.HashSet;

public class HashSetDemo {


    public static void main(String args[])
    {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(10);
        hs.add(20);

        hs.add(null);
       // hs.add(null);
        //  hs.add(null);

        hs.remove(10);
        System.out.println(hs);
    }

}
