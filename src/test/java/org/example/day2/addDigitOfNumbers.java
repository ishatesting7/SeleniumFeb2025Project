package org.example.day2;

import java.util.Scanner;

public class addDigitOfNumbers {

    /*
    9382;
    9+3+8+2
    */

    public static void main(String args[])
    {
        // % and /
        Scanner s = new Scanner((System.in));
        int m;
        System.out.println("Enter the Numbers");
        m = s.nextInt();
        int sum;
        for(sum = 0;m!=0;m/=10)
        {
            sum += m%10;  //293%10
        }

        System.out.println("Sum of Digit - "+ sum);
    }

    // Input - 38.42
    // Output - 11.6

}
