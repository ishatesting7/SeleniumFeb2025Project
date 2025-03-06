package org.example.day5;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String args[])
    {
        /*
        - Dynamic Sizing
        - Indexed
         */
        ArrayList<String> arrL = new ArrayList<>();
        arrL.add("Java");
        arrL.add(".NET");
        arrL.add("C++");
        System.out.println(arrL);
        System.out.println(arrL.size());
        System.out.println(arrL.isEmpty());
        System.out.println(arrL.get(2));
        arrL.clear();
        System.out.println(arrL.size());

        // 10 Methods

    }
}
