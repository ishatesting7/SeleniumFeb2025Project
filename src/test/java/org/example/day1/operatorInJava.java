package org.example.day1;

public class operatorInJava {


    /*
    1. Arithmetic Operator
    2. Assignment Operator
    3. Relational Operator (Comparison Operator)
    4. Logical Operator
    5. Unary Operator
    6. Bitwise Operator
     */
    static int m = 100;
    public static void main(String args[])
    {
        arithmeticOperator();
        assignmentOperator();
        RelationalOperator();
        logicalOperator();
    }

    static void arithmeticOperator()
    {
        int a  = 10, b = 20;
        System.out.println("Addition = "+(a+b));
        System.out.println("Sub = "+(a-b));
        System.out.println("Mul = "+(a*b));
        System.out.println("Remainder = "+(b%a));
        System.out.println("Quotient = "+(b/a));
    }

    static void assignmentOperator()
    {
        int a, b;
        a = 10;
        b = 20;
        a+=b;
        System.out.println("Addition = "+a);

        b+=a;
        System.out.println("Addition = "+b);

        b-=a;
        System.out.println("Subtraction = "+b);

        /*
        -=
        *=
        /=
        %=
        !=
        >>=
        <<=
         */
    }

    static void RelationalOperator()
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
        if(a==b)
        {
            System.out.println("Match");
        }
        else
        {
            System.out.println("Not Match");
        }

        // IF ELSE IF
        if(a.equals("hello"))
        {
            System.out.println("HELLO");
        } else if (a.isBlank()) {


        } else if (true) {

        } else if (true) {

        }

        //IF WITHOUT ELSE
        if(true)
        {
            //logic
        }



    }

    static void logicalOperator()
    {
        //AND - T only if both are true

        //OR - T only if any one of them is True

        if(!(false && 1>3 && 6>3))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
        int age = 10;
        if(!(age>18))
        {

        }
        else
        {

        }
        //if(!(a,e,i,o,u))
    }
}
