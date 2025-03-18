package org.actionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class demo1Action {

    //Hovering on the element
    @Test
    void actionDemo1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        Actions action = new Actions(driver);

        WebElement languageD = driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));

        action.moveToElement(languageD).build().perform();

        Thread.sleep(5000);
    }

    @Test

    void actionDemo2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        Actions action = new Actions(driver);

        WebElement homeSearchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));

        action.sendKeys(homeSearchBox,"Toys").build().perform();

        WebElement homeSearchIcon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

        action.click(homeSearchIcon).build().perform();

        Thread.sleep(4000);

        // menuFresh
        // menuMXPlayer

    }

    @Test
    void actionDemo3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://qa-practice.netlify.app/double-click");

        Actions action = new Actions(driver);

        WebElement doubleClickDemo = driver.findElement(By.xpath("//button[@id='double-click-btn']"));

        action.doubleClick(doubleClickDemo).build().perform();

        Thread.sleep(3000);

        action.contextClick(doubleClickDemo).build().perform();

        Thread.sleep(4000);

        // menuFresh
        // menuMXPlayer

    }

    //source - //div[text()='Episode I - The Phantom Menace']

    //destination - //div[text()='Episode III - Revenge of the Sith']


    @Test
    void dragAndDropDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://material.angular.io/cdk/drag-drop/overview");

        driver.manage().window().maximize();

        Thread.sleep(10000);

        Actions action = new Actions(driver);

        WebElement source = driver.findElement(By.xpath("//div[text()='Episode I - The Phantom Menace']"));

        WebElement destination = driver.findElement(By.xpath("//div[text()='Episode III - Revenge of the Sith']"));

        action.dragAndDrop(source, destination).build().perform();

    }

}
