package org.selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class dropdownDemo {

        @Test
        void dropdownDemo() throws InterruptedException {
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.facebook.com/r.php?entry_point=login");

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            WebElement day = driver.findElement(By.id("day"));
            WebElement year = driver.findElement(By.id("year"));

            Select select = new Select(day);
            Select select1 = new Select(year);
            select.selectByValue("15");
            select1.selectByValue("2020");

            Thread.sleep(5000);



        }

        @Test
    void dropdownDemo2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement color = driver.findElement(By.id("colors"));

        Select select = new Select(color);

        select.selectByVisibleText("Blue");
        select.selectByVisibleText("Green");
        select.selectByVisibleText("Red");

        Thread.sleep(5000);

    }
}
