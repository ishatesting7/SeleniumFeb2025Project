package org.seleniumLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.util.List;

public class locatorDemo1{

    @Test
    void demoLocatorID()
    {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement clickBtn = driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        clickBtn.click();

        String pageURL = driver.getCurrentUrl();

        Assert.assertEquals(pageURL,"https://www.saucedemo.com/inventory.html","URL is not matching");

        driver.close();
        //driver.close();
        //Locators
        /*
        <input class="input_error form_input" placeholder="Username"
        type="text" data-test="username" id="user-name" name="user-name"
        autocorrect="off" autocapitalize="none" value="standard_user">

        Tags - input
        attribute - class, placeholder, type, data-test
        value - "Username
         */
        //ID

    }


    @Test
    void demoLocatorClass()
    {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        List<WebElement> inputField = driver.findElements(By.className("form_input"));
        inputField.get(0).sendKeys("standard_user");
        inputField.get(1).sendKeys("secret_sauce");
        driver.close();
        //Locators
        /*
        <input class="input_error form_input" placeholder="Username"
        type="text" data-test="username" id="user-name" name="user-name"
        autocorrect="off" autocapitalize="none" value="standard_user">

        Tags - input
        attribute - class, placeholder, type, data-test
        value - "Usernamee
         */
        //Class
    }

    @Test
    void locatorDemoName()
    {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement clickBtn = driver.findElement(By.cssSelector("[type='submit']"));

        username.sendKeys("Admin");
        password.sendKeys("admin123");
        clickBtn.click();
        driver.close();

        /*
        CSS
        1. If you are aware about ID - then the CSS selector will be - #ID
        2. If you are aware about class name - then the CSS selector will be - .classname
        3. If you are aware about attribute and value - then the
        CSS selector will be - [attribute='value']
        4. If you are aware about tag, attribute as well as
        value - then the CSS selector will be - tag[attribute = 'value']
         */
    }
}
