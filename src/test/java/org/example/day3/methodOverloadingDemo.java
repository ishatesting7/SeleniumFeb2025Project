package org.example.day3;

import junit.framework.Assert;

public class methodOverloadingDemo {

    public static void main(String args[])
    {
            methodOverloadingDemo obj = new methodOverloadingDemo();
            obj.method1("333","3333","333333");
            obj.method1();
            obj.method1(32,"39234");
    }
    /*
    1. Method should have same name
    2. Number of parameter should be different
     */
    void method1()
    {
        System.out.println("Without Parameter");
    }
    void method1(String a, String b)
    {
        System.out.println("With two String parameter");

    }
    void method1(int a, String b)
    {
        System.out.println("With one Int and one String parameter");

    }
    void method1(String a, int b)
    {
        System.out.println("With one String and one Int parameter");

    }
    void method1(String a, String b, String c)
    {
        System.out.println("With 3 String parameter");

    }
}
