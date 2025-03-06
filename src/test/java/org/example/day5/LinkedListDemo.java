package org.example.day5;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String args[])
    {
        LinkedList<Integer> intL = new LinkedList<>();
        intL.add(10);
        intL.add(10);
        intL.add(10);
        intL.add(10);
        intL.add(10);
        System.out.println(intL);
        intL.addFirst(100);
        intL.addLast(102);

    }
}
