package org.actionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class actionDemo2 {


    @Test
    void pressKeyDemo()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement searchBox = driver.findElement(By.cssSelector("[class='gLFyf']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(searchBox).sendKeys(Keys.RETURN).build().perform();

        actions.moveToElement(searchBox)
                .click()
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .build().perform();

    }
}
