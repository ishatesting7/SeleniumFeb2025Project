package org.windowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandles {


    public static void main(String arg[]) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        Thread.sleep(5000);
        WebElement ele1 =  driver.findElement(By.cssSelector("[href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]"));

        WebElement ele2 =  driver.findElement(By.cssSelector("[href=\"https://www.facebook.com/OrangeHRM/\"]"));

        WebElement ele3 =  driver.findElement(By.cssSelector("[href=\"https://twitter.com/orangehrm?lang=en\"]"));

        ele1.click();
        ele2.click();
        ele3.click();

        String mainWindow = driver.getWindowHandle();

        System.out.println(mainWindow);
        Set<String> listOfWindows = driver.getWindowHandles();
        System.out.println(listOfWindows);

        for(String win : listOfWindows)
        {
            if(!win.equals(mainWindow))
            {
                driver.switchTo().window(win);
                System.out.println("Title - "+ driver.getTitle());
            }
        }

        driver.switchTo().window(mainWindow);

        System.out.println("Main Window Title - "+ driver.getTitle());


    }

}
