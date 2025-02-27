package org.example.day1;

import java.util.Scanner;

public class ifElseDemo {

    public static void main(String args[])
    {
          /*
        ==
        !=
        >
        <
        >=
        <=
         */
        //Conditional Statement
        // If else
        String a = "hello";
        String b = "hello";
        // IF ELSE
//        if(a==b)
//        {
//            System.out.println("Match");
//        }
//        else
//        {
//            System.out.println("Not Match");
//        }
//
//        // IF ELSE IF
//        if(a.equals("hello"))
//        {
//            System.out.println("HELLO");
//        } else if (a.isBlank()) {
//
//
//        } else if (true) {
//
//        } else if (true) {
//
//        }
//
//        //IF WITHOUT ELSE
//        if(true)
//        {
//            //logic
//        }
//
//
//
//


        String str = "I am new to Java";

        boolean flag = true;

        String result = (flag) ? "Make it True" : "Make it False";

        //Scanner Class

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Value --");

        double marks = s.nextDouble();

        String result1 = (marks>50) ? "You are passed":"You are failed";

        System.out.println("Result is - "+ result1);

    }
}
