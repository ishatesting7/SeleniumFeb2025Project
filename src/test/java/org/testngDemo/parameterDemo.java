package org.testngDemo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterDemo {

    @Test
    @Parameters({"username", "password"})
    void demo1(@Optional("userOptional") String username, @Optional("userPassword") String password)
    {
        System.out.println("Username -- "+ username);
        System.out.println("Password -- "+ password);
    }

    @Test
    @Parameters({"username", "password"})
    void demo2(String username, String password)
    {
        System.out.println("I am having username as -- "+ username);
        System.out.println("I am having password as -- "+ password);

    }

    //Environment URL
    //Environment Name
    //Browser
    //OS
    //4 Set - MasterAdmin, Admin,


}
