package org.testngDemo;


import org.testng.annotations.Test;

public class groupAttribute2 {

    @Test(groups = {"smoke","sanity"})
    void demo1()
    {
        System.out.println("Test case belonging to Smoke and Sanity");
    }


    @Test(groups = {"performance"})
    void demo2()
    {
        System.out.println("Test case belonging to Performance");
    }

    @Test(groups = {"regression"})
    void demo3()
    {
        System.out.println("Test case belonging to regression");
    }



    @Test(groups = {"smoke"})
    void demo4()
    {
        System.out.println("Test case belonging to Smoke");
    }

}

