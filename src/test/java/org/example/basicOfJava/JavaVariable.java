package org.example.basicOfJava;

public class JavaVariable {

    //Java Variables + Datatype
    // datatype variable-name <assignment operator> value

    public static void main(String args[])
    {
        int m = 10;  // integer is taking - 4 Bytes
        float n = 10.893f; // literals
        char o = 'A'; //
        String str = "I am new to Java";
        double d = 29.292384d;
        boolean flag = true;

        System.out.println("Value of Integer- "+m);
        System.out.println("Value of Float - "+n);
        System.out.println("Value of Char - "+o);
        System.out.println("Value of String - "+str);
        System.out.println("Value of Boolean - "+flag);

        short sh;
        sh = 283;
        long lg;
        lg = 293002;
        byte bt;
        bt = 127;
        // byte < short < int < long
        final float pi = 3.14f;

    }

}


