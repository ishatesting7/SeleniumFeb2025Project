package org.example.basicOfJava;

public class methodDemo {

    public static void main(String args[])
    {
        methodDemo obj = new methodDemo();
        obj.addTwoNumber();
        obj.addThreeNumber();
        String ref = obj.getNumberIntoWord();
        System.out.println(ref);
        boolean flag = obj.isEligibleForVote();
        System.out.print(flag);
        additionOfFourNumber();
    }

    //OBJECT CREATION
    /*
    OBJECT - Instance which has the address of all the variable and methods which are present in the class
    SYNTAX - ClassName objName = new ClassName
    */
    //---METHODS/FUNCTION--
    //ReturnType NameOfMethod()
    //Method Definition
    //Method Call
    void addTwoNumber()
    {
        int a = 10, b = 20;
        a = a + b;
        System.out.println("Addition of 2 number is - "+a);
    }
    void addThreeNumber()
    {
        int a = 10, b = 20, c = 30;
        a = a + b + c;
        System.out.println("Addition of 3 number is - " +a);
    }
    boolean isEligibleForVote()
    {
        int age = 19;
        if(age > 18)
        {
            //return true
            System.out.println("Person is eligible for VOTE");
        }
        else {
            //return false
            System.out.println("Person is NOT eligible for VOTE");
        }

        return false;
    }

    String getNumberIntoWord()
    {
        return "Hello I am new to Java";
    }

    static void additionOfFourNumber()
    {
        int a = 10;
        float b = 20.34f;
        double c = 30.93830984d;
        short d = 50;
        double sum = 0;
        sum = a+b+c+d;
        System.out.println("Addition of 4 number = "+ sum);
    }


}
