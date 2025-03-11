package org.testngDemo;

import org.testng.annotations.*;

public class annotationDemo {

    @BeforeSuite
    void beforeSuiteDemo()
    {
        System.out.println("Before Suite Demo");
    }

    @BeforeTest
    void beforeTestDemo()
    {
        System.out.println("Before Test Demo");

    }

    @BeforeClass
    void beforeClassDemo()
    {
        System.out.println("Before Class Demo");

    }

    @BeforeMethod
    void beforeMethodDemo()
    {
        System.out.println("Before Method Demo");

    }
// BeforeSuite --> BeforeTest --> BeforeClass -->BeforeMethod(3 Method
// -->AfterMethod(3 Method) --> AfterClass --> AfterTest -->AfterSuite

    @Test
    void testDemo1()
    {
        System.out.println("=====TEST 1========");

    }
    @Test
    void testDemo2()
    {
        System.out.println("=======TEST 2=======");

    }

    @Test
    void testDemo3()
    {
        System.out.println("=======TEST 3=======");

    }

    @AfterMethod
    void afterMethodDemo()
    {
        System.out.println("After Method Demo");

    }

    @AfterClass
    void afterClassDemo()
    {
        System.out.println("After Class Demo");

    }

    @AfterTest
    void afterTestDemo()
    {
        System.out.println("After Test Demo");

    }
    //@BeforeGroups
    @AfterSuite
    void afterSuiteDemo()
    {
        System.out.println("After Suite Demo");

    }
}
//Framework - Define things in before Suite -
//global - qa
//DB Connection
//Logger
//AccessToken - AuthToken, OATH Token, JWT Token,
//Initializing the webdriver