package org.example.day6;

import java.io.IOException;

public class ExceptionHandlingDemo {

    /*
    Checked/Unchecked
    compileTime/RunTime
    try-catch/
    Checked - IOException SQLException
    UnChecked - Nullpointer,
     */
    public static void main(String args[])
    {
        try{

            int[] a = {1,3,4};
            System.out.println(a[4]);

        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(1/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());

        }
    }
}
