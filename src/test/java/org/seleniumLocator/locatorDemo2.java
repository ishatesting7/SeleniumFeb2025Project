package org.seleniumLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class locatorDemo2 {


    @Test
    void xpathDemo1()
    {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));

        WebElement passWord = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));

        userName.sendKeys("Admin");

        passWord.sendKeys("admin123");

        loginBtn.click();


    }


    @Test
    void xpathDemo2()
    {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));

        WebElement passWord = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));

        userName.sendKeys("Admin");

        passWord.sendKeys("admin123");

        loginBtn.click();


    }

    @Test
    void xpathDemo3()
    {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(50))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);

        WebElement ele = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo")));

        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));

        WebElement passWord = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));

        userName.sendKeys("Admin");

        passWord.sendKeys("admin123");

        loginBtn.click();


    }

    /*
    Waits
    -----
    1. Implicit Wait
    2. Explicit Wait
    3. Fluent Wait
    4. Thread.sleep(10)

     */
    /*
    - Xpath - 2 Type
    - Relative
    - Absolute
    // - Relative  --- //
    1 -> //tagname[@attribute = "value"] --> eg. //input[@id = 'user-name']
    2 -> Contains -> //tagname[contains(@attribute, 'value')]
    3 -> Starts-with -> //tagname[starts-with(@attribute,'value')]
    4 -> texts ->//tagname[text()='actual text']
               ->//tagname[contains(text(),'partial-text')]
    5 -> AND/OR -> //input[@attribute1 = "demo" and @attribute2 = "demo2"]
                   //input[@attribute1 = "demo" or @attribute2 = "demo2"]
    6 -> XPath Axes -> parent - //h4[text()='Accepted usernames are:']/parent::div
                       child -
                       following-sibling
                       preceding-sibling
    Plugin - SelectorHub - https://selectorshub.com/selectorshub/
             ChroPath - Get from unlisted source








    /  - Absolute  --- /html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input


     */
}
