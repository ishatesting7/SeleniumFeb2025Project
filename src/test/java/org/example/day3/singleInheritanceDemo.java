package org.example.day3;

class inheritanceDemo {

    /*
    Parent - Child
    Super  - sub
    1. Single Inheritance
    2. Multilevel Inheritance
    3. Hierarchical Inheritance

    4. Multiple Inheritance - Not supported by java but with the help of Interface concept
    we can achieve it


     */
    public void singleInheritanceDemo()
    {
        System.out.println("I am in singleInheritanceDemo");
    }
}
public class singleInheritanceDemo extends inheritanceDemo
{
    public  static void main(String args[])
    {
        singleInheritanceDemo obj = new singleInheritanceDemo();
        obj.singleInheritanceDemo();
    }

}
//BaseClass -- Initiate the Driver, Initiate the connection, Selection of browser, Initiation
//ChildClass extend BaseClass
//ChildClass1 --> Just your testcase1
//ChildClass2 extends BaseClass