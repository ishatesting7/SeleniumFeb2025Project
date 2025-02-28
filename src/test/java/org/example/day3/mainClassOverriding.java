package org.example.day3;
class methodOverRidingDemo
{
    int m = 100;
    public void method1()
    {
        System.out.println("I am method1 in Parent");
    }
    public void method2()
    {
        System.out.println("I am method2 in Parent");
    }
}

class methodOverRidingDemo2 extends methodOverRidingDemo
{
    int m = 100;
    public void method1()
    {
        System.out.println("I am method1 in Parent");
    }
    public void method2()
    {
        System.out.println("I am method2 in Parent");
    }
}
class methodOverRidingDemo1 extends methodOverRidingDemo{

    @Override
    public void method1()
    {
        System.out.println("I am method1 in Child");
    }
    public void method2()
    {
        System.out.println("I am method2 in Child");
    }

}
public class mainClassOverriding{

    public static void main(String args[])
    {
        methodOverRidingDemo parent = new methodOverRidingDemo();
        parent.method1();
        parent.method2();

        methodOverRidingDemo1 child = new methodOverRidingDemo1();
        child.method1();
        child.method2();

        methodOverRidingDemo newobj = new methodOverRidingDemo1();
        newobj.method1();
        newobj.method2();

        //methodOverRidingDemo1 objnew2 = new methodOverRidingDemo(); - Not a valid statement


    }

}