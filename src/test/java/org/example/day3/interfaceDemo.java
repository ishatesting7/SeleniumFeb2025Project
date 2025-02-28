package org.example.day3;

public interface interfaceDemo {

    default void demo1()
    {
        System.out.println("I am in interface Demo");
    }
    static void demo2()
    {

    }
    void demo3();

    /*
    1. All the methods in interface are abstract method. Without body method are called as
    abstract method. After Java 8 - default Method with body and even static method is allowed

    2. Implements Keyword

    3.All the method which are in interface they are by default - public
     */
}



