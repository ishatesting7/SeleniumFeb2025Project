package org.testngDemo;

import org.testng.annotations.Test;

public class attributeTestNGDemo {

    @Test(priority = 1)
    void demo1()
    {
        System.out.println("I am in priority 1");
    }

    @Test(priority = 2)
    void demo2()
    {
        System.out.println("I am in priority 2");
    }

    @Test(priority = -1)
    void demo3()
    {
        System.out.println("I am in priority -1");
    }

    @Test(invocationCount = 5)
    void demo4()
    {
        System.out.println(" I am running for 5 times");
    }

    @Test(timeOut = 2)
    void demo5()  {
        System.out.println(" I am having timeout of 1000 ms");
    }

    @Test(description = "Description of Test Cases")
    void testDemo()
    {
        System.out.println("I am in description attribute");
    }

}
