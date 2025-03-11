package org.testngDemo;


import org.testng.annotations.Test;

@Test(groups = "Smoke")
public class groupAtClass
{
    public void Demo1()
    {
        System.out.println("I am in class 1");
    }

    public void Demo2()
    {
        System.out.println("I am in class 2");
    }
}

