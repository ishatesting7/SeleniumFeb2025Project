package org.example.day2;

import java.util.Scanner;

public class arrayDemo {

    public static void main(String args[])
    {
        int[] intarry = {1,2,3,4};

        int []intarray2 = new int[3];

        float[] floatarray = {1.2f,3.4f,34.4f};

        Scanner s = new Scanner(System.in);

        System.out.println("Input the Array");

        for(int i = 0; i<intarray2.length; i++)
        {
            intarray2[i] = s.nextInt();
        }

        System.out.println("Array Value is - ");

        for(int i = 0; i<intarray2.length; i++)
        {
            System.out.println(intarray2[i]);
        }



    }
}
