package org.testNGlistenerDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionDemo {

    //Allure Reporting
    //Extends Reporting

    @Test
    void demoAssert()
    {
        int a = 10;
        int b = 20;
        Assert.assertEquals(a,b);

    }

    @Test
    void demoAssert1()
    {
        int a = 10;
        int b = 20;
        Assert.assertTrue(true);

    }
    void demoAssert2()
    {
        int a = 10;
        int b = 20;
        Assert.assertFalse(false);

    }

    @Test
    void demoAssert3()
    {
        int a = 10;
        int b = 20;
        SoftAssert sf = new SoftAssert();

        Assert.assertFalse(false);
        Assert.assertEquals("title","titles","It is not matching");
    }


    //Sauce Labs Bike Light
    // String title = "Sauce Labs Bike Light"

        //Step3 - Validate the Product Image

        //Step4 - Validate that the username field is editable

}
