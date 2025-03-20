package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginTest{

    public WebDriver driver;
    public loginPage lp;
    @BeforeMethod
    void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        lp = new loginPage(driver);

    }

    @Test(priority = 1)
    void loginIntoApplication()
    {
        lp.enterUsername("standard_user");
        lp.enterPassword("secret_sauce");
        lp.clickLoginButton();
    }

    @Test(priority = 2)
    void loginIntoApplicationWithInvalidUserName()
    {
        lp.enterUsername("standard_usr");
        lp.enterPassword("secret_sauce");
        lp.clickLoginButton();
    }
}
