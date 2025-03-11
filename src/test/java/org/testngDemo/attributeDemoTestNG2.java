package org.testngDemo;

import org.testng.annotations.Test;

public class attributeDemoTestNG2 {

    @Test(dependsOnMethods = {"demo2","demo3"})
    void demo1()
    {
        System.out.println("I am method demo1 ");
    }

    @Test
    void demo2()
    {
        System.out.println("I am method demo2 ");

    }

    @Test
    void demo3()
    {
        System.out.println("I am method demo3");
    }

    @Test(alwaysRun = true)
    void demo4()
    {
        System.out.println("I am in always Run");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    void demo5()
    {
    System.out.println(1/0);
    }
}


