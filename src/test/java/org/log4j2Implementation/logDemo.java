package org.log4j2Implementation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class logDemo {

    public Logger logger;
    WebDriver driver;
    @BeforeSuite
    void setUp()
    {
        logger = LogManager.getLogger(this.getClass());
        driver= new ChromeDriver();
    }

    @Test
    void testCase1()
    {
        logger.info("************ TEST CASE 1 Started **********************");
        logger.info("Navigating to the URL");
        driver.get("https://www.saucedemo.com/");

    }

    @Test
    void testCase2()
    {
        logger.info("************ TEST CASE 2 Started **********************");
        logger.info("Navigating to the URL - 2");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }


}
