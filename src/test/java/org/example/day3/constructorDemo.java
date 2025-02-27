package org.example.day3;

public class constructorDemo {

    String browser;
    /*
    1. constructor are method which has same name as classname
    2. constructor are invoked during the object creation
    3. constructor are of 2 type  -  default and parameterised
    4. constructor will not have return type
     */
    public static void main(String args[])
    {
        constructorDemo obj = new constructorDemo();
        constructorDemo obj1 = new constructorDemo("chrome");
        constructorDemo obj2 = new constructorDemo("firefox");
        constructorDemo obj3 = new constructorDemo("firefox", "window");

    }
    constructorDemo()
    {
        System.out.println("I am in contructor");
    }

    constructorDemo(String browser)
    {
        browser = "Chrome";
        System.out.println("I am in contructor"+browser);
    }

    constructorDemo(String browser, String osmachine)
    {
        browser = "Chrome";
        System.out.println("I am in contructor"+browser);
    }


    /*
     - Method Overloading

     */
}
